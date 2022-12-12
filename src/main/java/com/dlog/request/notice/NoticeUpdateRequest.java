package com.dlog.request.notice;

// 추후 자바가 16버전 이상으로 바뀔 경우 record를 사용하는 것 좋아보임
public class NoticeUpdateRequest {
    private String title;
    private String txt;
    private String userNo;

    public NoticeUpdateRequest(String title, String txt, String userNo) {
        this.title = title;
        this.txt=txt;
        this.userNo = userNo;
    }

    public String getTitle() {
        return title;
    }

    public String getTxt() {
        return txt;
    }

    public String getUserNo() {
        return userNo;
    }
}
