package com.dlog.service.user;

import com.dlog.dao.user.UserDAO;
import com.dlog.vo.user.UserVO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService{
    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);

    @Inject
    private UserDAO userDAO;

    @Override
    public List<UserVO> getUserList() throws Exception {
        return userDAO.getUserList();
    }

    @Override
    public UserVO getUserInfo(int userNo) throws Exception {
        return userDAO.getUserInfo(userNo);
    }

    @Override
    public void insertUser(UserVO userVO) throws Exception {
        userDAO.insertUser(userVO);
    }

    @Override
    public void updateUser(UserVO userVO) throws Exception {
        userDAO.updateUser(userVO);
    }

    @Override
    public void deleteUser(int userNo) throws Exception {
        userDAO.deleteUser(userNo);
    }
}
