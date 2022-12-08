package com.dlog.controller.admin;


import com.dlog.service.admin.NoticeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/admin")
public class AdminMainController {

    @Inject
    @Qualifier("NoticeServiceImpl")
    private NoticeService noticeService;

    // 관리자 페이지의 메인 페이지가 만들어지면 추가
    // 만약 관리자로 로그인 되어 있지 않다면 강제로 '/'로 넘어갈 수 있도록 설정
    @GetMapping
    public String main(){
        return "index";
    }

    @GetMapping("/noticeList")
    public String notice(Model model) throws Exception {
        model.addAttribute("noticeList",noticeService.getNoticeList());
        return "admin/notice/noticeList";
    }

}
