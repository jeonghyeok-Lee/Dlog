package com.dlog.service;

import com.dlog.mapper.MainMapper;
import com.dlog.vo.MainVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service("MainServiceImpl")
@Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class)
public class MainServiceImpl implements MainService{

    @Autowired
    private MainMapper mainMapper;

    @Override
    public MainVO getDbTime() {
        return mainMapper.getCurTime();
    }


}
