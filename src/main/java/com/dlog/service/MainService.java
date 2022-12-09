package com.dlog.service;

import com.dlog.domain.vo.MainVO;


public interface MainService {

    // 현재 시간을 받아오는 getCurTime()하나 정의
    public MainVO getDbTime();
}
