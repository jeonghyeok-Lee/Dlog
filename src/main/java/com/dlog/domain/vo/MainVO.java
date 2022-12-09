package com.dlog.domain.vo;

// 단순하게 getter/setter만 있는 VO 생성 이후 Mapper 생성
public class MainVO {
    public MainVO() {}

    private String curTime;

    public String getCurTime() {
        return curTime;
    }

    public void setCurTime(String curTime) {
        this.curTime = curTime;
    }

    @Override
    public String toString() {
        return "MainVo{" +
                "curTime='" + curTime + '\'' +
                '}';
    }
}
