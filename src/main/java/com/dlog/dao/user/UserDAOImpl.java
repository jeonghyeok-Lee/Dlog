package com.dlog.dao.user;

import com.dlog.vo.user.UserVO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO{

    //Mybatis를 이용하여 DAO를 구현하려면 SqlSession 객체가 필요
    //Conntection-> 단순히 물리적인 연결
    //SqlSession -> RDB에 인증을 거친 논리적인 연결
    @Inject
    private SqlSession sqlSession;


    // mapper의 namespace에 맞게 설정
    @Override
    public List<UserVO> getUserList() throws Exception {
        return sqlSession.selectList("LoginService.getUserList");
    }

    @Override
    public UserVO getUserInfo(int userNo) throws Exception {
        return sqlSession.selectOne("LoginService.getUserInfo",userNo);
    }

    @Override
    public int getLoginUser(UserVO userVO) throws Exception {
        System.out.println("DAO : " + sqlSession.selectList("LoginService.getLoginUser",userVO));
        return sqlSession.selectOne("LoginService.getLoginUser",userVO);
    }

    @Override
    public int insertUser(UserVO userVO) throws Exception {
        return sqlSession.insert("LoginService.insertUser",userVO);
    }

    @Override
    public int updateUser(UserVO userVO) throws Exception {
        return sqlSession.update("LoginService.updateUser",userVO);
    }

    @Override
    public int deleteUser(int userNo) throws Exception {
        return sqlSession.delete("LoginService.deleteUser",userNo);
    }
}
