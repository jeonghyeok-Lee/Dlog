package com.dlog.dao.admin;

import com.dlog.vo.admin.NoticeVO;
import com.dlog.vo.admin.NoticeViewVO;

import java.util.List;

public interface NoticeDAO {

    // 공지사항 리스트
    public List<NoticeViewVO> getNoticeList() throws Exception;

    public List<NoticeVO> getNoticeListNum() throws Exception;

    // 공지사항 정보가져오기
    public NoticeVO getNoticeInfo(int userNo) throws Exception;

    // 공지사항 추가
    public int insertNotice(NoticeVO noticeVO) throws Exception;

    // 공지사항 업데이트
    public int updateNotice(NoticeVO noticeVO) throws  Exception;

    // 공지사항 삭제
    public int deleteNotice(int noticeNo) throws  Exception;

}
