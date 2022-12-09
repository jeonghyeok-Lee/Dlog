package com.dlog.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Controller
@RequestMapping("/admin")
public class AdMainController {

    // 관리자 페이지의 메인 페이지가 만들어지면 추가
    // 만약 관리자로 로그인 되어 있지 않다면 강제로 '/'로 넘어갈 수 있도록 설정
    @GetMapping
    public String main(){
        return "index";
    }



}
