package com.dlog.controller.admin;

import com.dlog.request.notice.NoticeUpdateRequest;
import com.dlog.service.admin.NoticeService;
import com.dlog.domain.vo.admin.NoticeVO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
@RequestMapping("/admin/notice")
public class AdNoticeController {
    @Inject
    @Qualifier("NoticeServiceImpl")
    private NoticeService noticeService;

    // 공지사항 작성 페이지로 이동
    @GetMapping("/noticeForm")
    public String noticeForm(){
        return "admin/notice/noticeForm";
    }

    // 공지사항 추가 기능
    @PostMapping(value = "/insertNotice")
    public  String saveNoticeForm(NoticeUpdateRequest request, RedirectAttributes rttr) throws Exception{

        System.out.println("request.getTitle : "+request.getTitle());
        System.out.println("request.getTxt : "+request.getTxt());
        System.out.println("request.getUserNo : "+request.getUserNo());

        NoticeVO noticeVO = new NoticeVO();
        noticeVO.setNoticeTitle(request.getTitle());
        noticeVO.setNoticeContent(request.getTxt());
        noticeVO.setNoticeWriter(Integer.parseInt(request.getUserNo()));

        System.out.println(noticeVO);

        noticeService.insertNotice(noticeVO);
        return "redirect:/noticeList";

    }

    // 공지사항 수정 기능

    // 공지사항 삭제 기능
}
