package com.dlog.service.admin;


import com.dlog.vo.admin.NoticeVO;
import com.dlog.vo.admin.NoticeViewVO;

import java.util.List;

public interface NoticeService {

    public List<NoticeViewVO> getNoticeList() throws Exception;

    // 작성자명이 아닌 작성자 번호로 나오는 형태
    public List<NoticeVO> getNoticeListNum() throws Exception;

    public NoticeVO getNoticeInfo(int noticeNo) throws Exception;

    public void insertNotice(NoticeVO noticeVO) throws Exception;

    public void updateNotice(NoticeVO noticeVO) throws Exception;

    public void deleteNotice(int noticeNo) throws Exception;
}