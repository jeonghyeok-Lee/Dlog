package com.dlog.domain.vo.user;

import java.util.Date;

public class UserVO {
    private int userNo;             // 유저번호
    private String userId;          // 유저 아이디
    private String userPw;          // 유저 패스워드
    private String userName;        // 유저 이름
    private String userNicName;     // 유저 닉네임
    private Date userBirth;         // 유저 생일
    private String userEmail;       // 유저 이메일
    private boolean userConsent;    // 유저 동의 여부
    private Date userAddDate;       // 유저 생성 날짜
    private String userMgr;         // 유저 권한
    private String userGender;      // 유저 성별

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPw() {
        return userPw;
    }

    public void setUserPw(String userPw) {
        this.userPw = userPw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNicName() {
        return userNicName;
    }

    public void setUserNicName(String userNicName) {
        this.userNicName = userNicName;
    }

    public Date getUserBirth() {
        return userBirth;
    }

    public void setUserBirth(Date userBirth) {
        this.userBirth = userBirth;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public boolean isUserConsent() {
        return userConsent;
    }

    public void setUserConsent(boolean userConsent) {
        this.userConsent = userConsent;
    }

    public Date getUserAddDate() {
        return userAddDate;
    }

    public void setUserAddDate(Date userAddDate) {
        this.userAddDate = userAddDate;
    }

    public String getUserMgr() {
        return userMgr;
    }

    public void setUserMgr(String userMgr) {
        this.userMgr = userMgr;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userNo=" + userNo +
                ", userId='" + userId + '\'' +
                ", userPw='" + userPw + '\'' +
                ", userName='" + userName + '\'' +
                ", userNicName='" + userNicName + '\'' +
                ", userBirth=" + userBirth +
                ", userEmail='" + userEmail + '\'' +
                ", userConsent=" + userConsent +
                ", userAddDate=" + userAddDate +
                ", userMgr='" + userMgr + '\'' +
                ", userGender='" + userGender + '\'' +
                '}';
    }


}
