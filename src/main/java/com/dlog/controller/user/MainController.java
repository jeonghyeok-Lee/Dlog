package com.dlog.controller.user;
import com.dlog.service.MainService;
import com.dlog.service.admin.NoticeService;
import com.dlog.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;


// dispathcer-servlet에서 받은 요청을 처리할 핸들러 선택
@Controller
public class MainController {

    @Autowired
    @Qualifier("MainServiceImpl")
    private MainService mainService = null;

    @Inject
    @Qualifier("NoticeServiceImpl")
    private NoticeService noticeService;

    //메인 페이지
    @GetMapping("/")
    public String mainPage(Model model) throws Exception{
        model.addAttribute("noticeList",noticeService.getNoticeList());
        return "index";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String login(Model model){
        model.addAttribute("userVO", new UserVO());

        // 해당경로는 WEB-INF/views 에서의 경로임
        return "login/loginForm";
    }

    // 회원가입 페이지
    @GetMapping(value = "/signup")
    public String signupForm(Model model) throws Exception{
        model.addAttribute("UserVO", new UserVO());
        return "login/signupForm";
    }

    @GetMapping("/userInfo")
    public String userInfo(Model model) throws Exception {
        model.addAttribute("UserVO", new UserVO());
        return "user/userInfo";
    }

    @RequestMapping("/connection")
    public String dbConnection(){
        System.out.println("db에 접근함" + mainService.getDbTime());
        return "index";
    }


    @GetMapping("/noticeList")
    public String notice(Model model) throws Exception {
        model.addAttribute("noticeList",noticeService.getNoticeList());
        return "admin/notice/noticeList";
    }

}