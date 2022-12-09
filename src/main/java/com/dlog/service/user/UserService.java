package com.dlog.service.user;

import com.dlog.domain.vo.user.UserVO;

import java.util.List;

// Service 인터페이스
public interface UserService {

    // 사용자리스트
    public List<UserVO> getUserList() throws Exception;

    // 유저 정보가져오기
    public UserVO getUserInfo(int userNo) throws Exception;

    // 유저 로그인 대상 번호 가져오기
    public int getLoginUser(UserVO userVO ) throws Exception;

    // 유저 추가 -> DAO 인터페이스와는 차이가 있음을 인지
    public void insertUser(UserVO userVO) throws Exception;

    // 유저 업데이트
    public void updateUser(UserVO userVO) throws Exception;

    // 유저 삭제
    public void deleteUser(int userNo) throws Exception;
}
