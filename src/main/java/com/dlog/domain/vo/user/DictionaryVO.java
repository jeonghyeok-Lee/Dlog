package com.dlog.domain.vo.user;

public class DictionaryVO {

    private int dNo;
    private String dName;
    private String dDate;
    private int dUserNo;
    private int dTeamNo;
    private int dSubscribe;
    private int dPublic;

    public int getdNo() {
        return dNo;
    }

    public void setdNo(int dNo) {
        this.dNo = dNo;
    }

    public String getdName() {
        return dName;
    }

    public void setdName(String dName) {
        this.dName = dName;
    }

    public String getdDate() {
        return dDate;
    }

    public void setdDate(String dDate) {
        this.dDate = dDate;
    }

    public int getdUserNo() {
        return dUserNo;
    }

    public void setdUserNo(int dUserNo) {
        this.dUserNo = dUserNo;
    }

    public int getdTeamNo() {
        return dTeamNo;
    }

    public void setdTeamNo(int dTeamNo) {
        this.dTeamNo = dTeamNo;
    }

    public int getdSubscribe() {
        return dSubscribe;
    }

    public void setdSubscribe(int dSubscribe) {
        this.dSubscribe = dSubscribe;
    }

    public int getdPublic() {
        return dPublic;
    }

    public void setdPublic(int dPublic) {
        this.dPublic = dPublic;
    }

    @Override
    public String toString() {
        return "DictionaryVO{" +
                "dNo=" + dNo +
                ", dName='" + dName + '\'' +
                ", dDate='" + dDate + '\'' +
                ", dUserNo=" + dUserNo +
                ", dTeamNo=" + dTeamNo +
                ", dSubscribe=" + dSubscribe +
                ", dPublic=" + dPublic +
                '}';
    }
}
