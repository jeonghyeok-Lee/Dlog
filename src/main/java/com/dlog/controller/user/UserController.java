package com.dlog.controller.user;

import com.dlog.service.user.UserService;
import com.dlog.domain.vo.user.UserVO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.net.URLDecoder;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Inject
    @Qualifier("UserServiceImpl")
    private UserService userService;

    // 마이페이지로 이동
    // 추후 자신의 이름으로 변경해야함
    @GetMapping("/myPage")
    public String myPage(){
        return "/user/myPage";
    }

    // 회원 가입 기능
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public String insertUser(@ModelAttribute("userVO") UserVO userVO, RedirectAttributes rttr) throws Exception{


        // 한글 문제로 인해서 영어로 받아온뒤 한글로 수정
        if(userVO.getUserGender().equals("man")){
            userVO.setUserGender("남자");
        }else if(userVO.getUserGender().equals("woman")){
            userVO.setUserGender("여자");
        }

        userService.insertUser(userVO);

        // 유저를 추가한 후 해당 페이지로 이동
        return "redirect:../loginForm";
    }

    // 회원 수정 기능

    // 회원 탈퇴 기능

}
