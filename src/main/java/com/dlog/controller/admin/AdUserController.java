package com.dlog.controller.admin;

import com.dlog.service.user.UserService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.inject.Inject;

@Controller
@RequestMapping("/admin/user")
public class AdUserController {

    @Inject
    @Qualifier("UserServiceImpl")
    private UserService userService;

    // 회원 리스트 페이지로 이동
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public String getUserList(Model model) throws Exception{
        // jsp파일에서 사용할 key-value 설정
        model.addAttribute("userList", userService.getUserList());
        return "admin/user/userList";
    }

    // 회원 상세 정보 페이지로 이동

    // 회원 정보 수정 기능

    // 회원 삭제 기능

}
