package com.dlog.vo.user;

import java.util.Date;

public class UserVO {
    private int userNo;
    private String userId;
    private String userPw;
    private String userName;
    private String userNicName;
    private Date userBirth;
    private String userEmail;
    private boolean userConsent;
    private Date userAddDate;

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
                '}';
    }
}
