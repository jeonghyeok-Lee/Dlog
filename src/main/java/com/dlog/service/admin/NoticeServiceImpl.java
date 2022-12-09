package com.dlog.service.admin;

import com.dlog.domain.dao.admin.NoticeDAO;
import com.dlog.domain.vo.admin.NoticeVO;
import com.dlog.domain.vo.admin.NoticeViewVO;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
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
    public NoticeVO getNoticeInfo(int noticeNo) throws Exception {
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
