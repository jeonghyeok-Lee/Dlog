package com.dlog.controller;
import com.dlog.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


// dispathcer-servlet에서 받은 요청을 처리할 핸들러 선택
@Controller
public class MainController {

    @Autowired
    @Qualifier("MainServiceImpl")
    private MainService mainService = null;

    @RequestMapping("/")
    public String mainPage(){
        return "index";
    }

    @RequestMapping("/userInfo")
    public String index(){
        return "/user/userInfo";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "/login/loginFrom";
    }

    @RequestMapping("/connection")
    public String dbConnection(){
        System.out.println("db에 접근함" + mainService.getDbTime());
        return "index";
    }

}