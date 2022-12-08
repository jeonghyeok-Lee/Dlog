package com.dlog.controller.admin;


import com.dlog.service.admin.NoticeService;
import com.dlog.vo.admin.NoticeVO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    // 공지사항 작성 페이지
    @GetMapping("/noticeForm")
    public String noticeForm(){
        return "admin/notice/noticeForm";
    }


    @PostMapping(value = "/saveNotice")
    public  String saveNoticeForm(@ModelAttribute("NoticeVO")NoticeVO noticeVO, RedirectAttributes rttr) throws Exception{
        noticeService.insertNotice(noticeVO);
        return "redirect:admin/notice/noticeForm";

    }


}
