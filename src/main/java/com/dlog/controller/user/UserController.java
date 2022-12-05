package com.dlog.controller.user;

import com.dlog.service.user.UserService;
import com.dlog.vo.user.UserVO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    private UserService userService;

    @RequestMapping(value = "/getUserList", method = RequestMethod.GET)
    public String getUserList(Model model) throws Exception{
        // jsp파일에서 사용할 key-value 설정
        model.addAttribute("userList", userService.getUserList());
        return "user/userList";
    }

    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public String insertUser(@ModelAttribute("userVO") UserVO userVO, RedirectAttributes rttr) throws Exception{
        userService.insertUser(userVO);

        // 유저를 추가한 후 해당 페이지로 이동
        return "redirect:/user/userList";
    }

    @RequestMapping(value = "/signupForm", method = RequestMethod.GET)
    public String signupForm(Model model) throws Exception {
        model.addAttribute("userVO", new UserVO());
        return "login/signupForm";
    }
}
