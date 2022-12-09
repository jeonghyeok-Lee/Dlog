package com.dlog.controller.user;
import com.dlog.service.MainService;
import com.dlog.service.admin.NoticeService;
import com.dlog.service.user.UserService;
import com.dlog.domain.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


// dispathcer-servlet에서 받은 요청을 처리할 핸들러 선택
@Controller
public class MainController {

    @Autowired
    @Qualifier("MainServiceImpl")
    private MainService mainService = null;

    @Inject
    @Qualifier("NoticeServiceImpl")
    private NoticeService noticeService;

    @Inject
    @Qualifier("UserServiceImpl")
    private UserService userService;

    //메인 페이지로 이동
    @GetMapping("/")
    public String mainPage(Model model) throws Exception{
        model.addAttribute("noticeList",noticeService.getNoticeList());
        return "index";
    }

    // 로그인 페이지로 이동
    @GetMapping("/loginForm")
    public String loginForm(Model model){
        model.addAttribute("userVO", new UserVO());

        // 해당경로는 WEB-INF/views 에서의 경로임
        return "user/login/loginForm";
    }

    // 회원가입 페이지로 이동
    @GetMapping(value = "/signupForm")
    public String signupForm(Model model) throws Exception{
        model.addAttribute("UserVO", new UserVO());
        return "user/login/signupForm";
    }

    @RequestMapping("/connection")
    public String dbConnection(){
        System.out.println("db에 접근함" + mainService.getDbTime());
        return "index";
    }


    // 공지사항 페이지로 이동
    @GetMapping("/noticeList")
    public String notice(Model model) throws Exception {
        model.addAttribute("noticeList",noticeService.getNoticeList());
        return "admin/notice/noticeList";
    }


    // 인기 사전 리스트로 이동
    @GetMapping("/dictionaryList")
    public String dictionary() throws Exception{
        return null;
    }

    // 로그인 기능 수행
    // 사용자에게서 넘어온 값을 VO를 이용하여 서비스에 전달, 이를 통해 로그인한 유저 번호를 가져옴
    // 유저번호를 통해서 유저 데이터를 가져옴
    // request.getSession()을 통해서 세션 생성
    // 조건 절을 통해서 로그인 성공 여부를 구분
    @PostMapping("/loginUser")
    public String login(UserVO user, HttpServletRequest request) throws Exception {
        System.out.println(user.getUserId());
        int userNo = userService.getLoginUser(user);
        UserVO userData = userService.getUserInfo(userNo);

        HttpSession session =request.getSession();

        if (userData != null) {
            session.setAttribute("userData", userData);
            return "redirect:/";
        } else {
            session.setAttribute("userData", null);
            return "redirect:user/login/loginForm";
        }
    }

    // 로그아웃 기능 수행
    // 세션 데이터를 초기화후 메인페이지로 이동
    @GetMapping("/logoutUser")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/";
    }
}