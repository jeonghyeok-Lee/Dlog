package com.dlog.controller.login;

import com.dlog.vo.user.UserVO;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String loginForm(Model model) throws Exception{
        model.addAttribute("userVO", new UserVO());

        // 해당경로는 WEB-INF/views 에서의 경로임
        return "login/loginFrom";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signupForm(Model model) throws Exception{
        model.addAttribute("UserVO", new UserVO());
        return "login/signupForm";
    }
}
