package com.dlog.domain.vo.admin;

import java.util.Date;

public class NoticeVO {
    private int noticeNo;           // 공지사항 번호
    private int noticeWriter;       // 공지사항 작성자의 유저번호
    private String noticeTitle;     // 공지사항 제목
    private String noticeContent;   // 공지사항 내용
    private Date noticeDate;        // 공지사항 작성/수정 날짜
    private int noticeViews;        // 공지사항 조회수

    public int getNoticeNo() {
        return noticeNo;
    }

    public void setNoticeNo(int noticeNo) {
        this.noticeNo = noticeNo;
    }

    public int getNoticeWriter() {
        return noticeWriter;
    }

    public void setNoticeWriter(int noticeWriter) {
        this.noticeWriter = noticeWriter;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public Date getNoticeDate() {
        return noticeDate;
    }

    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    public int getNoticeViews() {
        return noticeViews;
    }

    public void setNoticeViews(int noticeViews) {
        this.noticeViews = noticeViews;
    }

    @Override
    public String toString() {
        return "NotificationVO{" +
                "noticeNo=" + noticeNo +
                ", noticeWriter=" + noticeWriter +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeContent='" + noticeContent + '\'' +
                ", noticeDate=" + noticeDate +
                ", noticeViews=" + noticeViews +
                '}';
    }
}
