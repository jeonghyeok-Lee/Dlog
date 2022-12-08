package com.dlog.vo.admin;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NoticeViewVO {
    private int noticeNo;           // 공지사항 번호
    private String userNicName;      // 공지사항 작성자명
    private String noticeTitle;     // 공지사항 제목
    private String noticeContent;   // 공지사항 내용
    private Date noticeDate;        // 공지사항 작성/수정 날짜

    private int noticeViews;        // 공지사항 조회수

    public int getNoticeNo() {
        return noticeNo;
    }
    public String getUserNicName() {
        return userNicName;
    }
    public String getNoticeTitle() {
        return noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public int getNoticeViews() {
        return noticeViews;
    }


    @Override
    public String toString() {
        return "NotificationVO{" +
                "noticeNo=" + noticeNo +
                ", noticeWriter=" + userNicName +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeDate=" + noticeDate +
                ", noticeViews=" + noticeViews +
                '}';
    }
}
