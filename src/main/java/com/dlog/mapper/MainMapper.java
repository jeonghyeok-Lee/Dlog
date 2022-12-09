package com.dlog.mapper;

import com.dlog.domain.vo.MainVO;
import org.springframework.stereotype.Repository;

// Mapper 인터페이스를 생성한 뒤 XML과 매핑하여 이용하는 방식
// Mapper인터페이스 생성 -> 이후 service 생성
@Repository("mainMapper")
public interface MainMapper {
    public MainVO getCurTime();
}
