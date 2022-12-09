package com.dlog.domain.dao.user;

import com.dlog.domain.vo.user.UserVO;

import java.util.List;

// 인터페이스
public interface UserDAO {

    // 사용자리스트
    public List<UserVO> getUserList() throws Exception;

    // 유저 정보가져오기
    public UserVO getUserInfo(int userNo) throws Exception;

    // 유저 로그인 대상 번호 가져오기
    public int getLoginUser(UserVO userVO) throws Exception;

    // 유저 추가
    public int insertUser(UserVO userVO) throws Exception;

    // 유저 업데이트
    public int updateUser(UserVO userVO) throws Exception;

    // 유저 삭제
    public int deleteUser(int userNo) throws Exception;
}
