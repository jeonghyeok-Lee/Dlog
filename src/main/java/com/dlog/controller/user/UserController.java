package com.dlog.controller.user;

import com.dlog.service.user.UserService;
import com.dlog.domain.vo.user.UserVO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Inject
    @Qualifier("UserServiceImpl")
    private UserService userService;

    // 마이페이지로 이동


    // 회원 가입 기능
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public String insertUser(@ModelAttribute("userVO") UserVO userVO, RedirectAttributes rttr) throws Exception{
        userService.insertUser(userVO);

        // 유저를 추가한 후 해당 페이지로 이동
        return "redirect:/user/userList";
    }

    // 회원 수정 기능

    // 회원 탈퇴 기능

}
