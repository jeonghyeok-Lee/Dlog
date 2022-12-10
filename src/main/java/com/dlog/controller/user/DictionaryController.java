package com.dlog.controller.user;

import com.dlog.service.user.DictionaryService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;

@Controller
@RequestMapping("/dictionary")
public class DictionaryController {

    @Inject
    @Qualifier("DictionaryServiceImpl")
    private DictionaryService dictionaryService;

    // 구독한 사전 페이지로 이동

    // 내 사전 페이지로 이동
    @GetMapping("/myDictionaryPage")
    public String myDictionaryPage(){
        return "";
    }

    // 사전 생성 페이지로 이동

    // 사전 생성 기능

    // 사전 수정 기능

    // 사전 삭제 기능
}
