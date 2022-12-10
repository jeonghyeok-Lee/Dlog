package com.dlog.controller.user;

import com.dlog.domain.vo.user.TestUserVO;
import com.dlog.service.user.UserService;
import com.dlog.domain.vo.user.UserVO;
import org.mybatis.logging.Logger;
import org.mybatis.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @Inject
    @Qualifier("UserServiceImpl")
    private UserService userService;

    // 마이페이지로 이동
    // 추후 자신의 이름으로 변경해야함
    @GetMapping("/myPage")
    public String myPage(){
        return "/user/myPage";
    }

    // 회원 가입 기능
    @RequestMapping(value = "/insertUser", method = RequestMethod.POST)
    public String insertUser(@ModelAttribute("testUserVO") TestUserVO userVO, RedirectAttributes rttr) throws Exception{

        // html에서 input type=date인경우 결과가 string 타입으로 반환되어 기존 UserVo로는 받을 수 없어
        // 임시방편으로 testUserVO를 만들어서 대체
        // 추가로 클라이언트에서 한글 작성시 해당 한글이 한클 코드 즉 %56%e8.. 등과 같은 형태로 구현됨
        // 이 형태로는 UserVO로 받아 올수 없어서 성별을 영어로 가져와서 여기서 수정하는 형태로 임시로 수렁

        UserVO userDate = new UserVO();
        userDate.setUserId(userVO.getUserId());
        userDate.setUserPw(userVO.getUserPw());
        userDate.setUserName(userVO.getUserName());
        userDate.setUserNicName(userVO.getUserNicName());
        String birth = userVO.getUserBirth();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse(birth));
        userDate.setUserBirth(sdf.parse(birth));
        if(userVO.getUserGender().equals("man")){
            userDate.setUserGender("남자");
        }else if(userVO.getUserGender().equals("woman")){
            userDate.setUserGender("여자");
        }
        userDate.setUserEmail(userVO.getUserEmail());
        userDate.setUserConsent(userVO.isUserConsent());

        userService.insertUser(userDate);

        // 유저를 추가한 후 해당 페이지로 이동
        return "redirect:../loginForm";
    }

    // 회원 수정 기능

    // 회원 탈퇴 기능

}
