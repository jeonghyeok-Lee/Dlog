package com.dlog.service.admin;

import com.dlog.domain.dao.admin.NoticeDAO;
import com.dlog.domain.vo.admin.NoticeVO;
import com.dlog.domain.vo.admin.NoticeViewVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Service("NoticeServiceImpl")
public class NoticeServiceImpl implements NoticeService{

    @Inject
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeViewVO> getNoticeList() throws Exception {
        return noticeDAO.getNoticeList();
    }

    @Override
    public List<NoticeVO> getNoticeListNum() throws Exception {
        return noticeDAO.getNoticeListNum();
    }

    @Override
    public NoticeViewVO getNoticeInfo(int noticeNo, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Cookie oldCookie = null;                    // 기존에 가지고 있는 쿠키
        Cookie[] cookies = request.getCookies();    // 요청받은 곳에서의 쿠키를 가지는 배열

        // 쿠키가 비어있는지 확인
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                // 비어있지 않다면 noticePage라는 이름을 갖고 있는 쿠키를 oldCookie에 저장
                if (cookie.getName().equals("noticePage")) {
                    oldCookie = cookie;
                }
            }
        }

        // 기존 쿠키가 존재한다면
        if(oldCookie != null){
            // noticePage라는 이름의 쿠키 중에서 현재 noticeNo(공지사항 번호)가 있는지 확인
            if(!oldCookie.getValue().contains("[" + noticeNo + "]")){
                // 없다면 
                oldCookie.setValue(oldCookie.getValue()+"["+noticeNo+"]");
                oldCookie.setPath("/");
                oldCookie.setMaxAge(60 * 60 * 24);
                response.addCookie(oldCookie);      // 새로 변경된 쿠키를 응답
                noticeDAO.updateViewCnt(noticeNo);  // 조회수 추가를 위함
            }
        }else{
            // 쿠키가 없다면 새로운 쿠키를 생성
            Cookie newCookie = new Cookie("noticePage","[" + noticeNo +"]");
            newCookie.setPath("/");                 // 쿠키의 패스를 설정[미입력시 현 위치로 패스설정된 쿠키가만들어짐]
            newCookie.setMaxAge(60 * 60 * 24);      // 쿠키 시간
            response.addCookie(newCookie);          // 만들어진 쿠키를 응답
        }

        return noticeDAO.getNoticeInfo(noticeNo);
    }

    @Override
    public void insertNotice(NoticeVO noticeVO) throws Exception {
        noticeDAO.insertNotice(noticeVO);
    }

    @Override
    public void updateNotice(NoticeVO noticeVO) throws Exception {
        noticeDAO.updateNotice(noticeVO);
    }

    @Override
    public void deleteNotice(int noticeNo) throws Exception {
        noticeDAO.deleteNotice(noticeNo);
    }

}
