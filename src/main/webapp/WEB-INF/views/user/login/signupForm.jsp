<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-10
  Time: 오후 7:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta charset="UTF-8">
    <%@include file="../../common/mainHead.jsp" %>
    <link rel="stylesheet" type="text/css" href="/resources/css/login/singin.css">
    <script defer src="/resources/js/login/signup.js"></script>
</head>
<body>
<%--헤더부분--%>
<%@include file="../../common/header.jsp" %>

<section class="default-container signup">
    <div class="default-first-child ">
        <div class="signup-filed" style="margin-top: 3rem">
            <div class="signup-header">회원가입</div>
            <div class="signup-body">
                <form class="signup-form" action="/user/insertUser" method="post" id="signup-form">
                    <div class="form-rows">
                        <label class="form-col-label" for="signup-id">아이디</label>
                        <input type="text" id="signup-id" name="userId" placeholder="아이디를 입력해주세요" class="signup-input">
                        <button type="button" class="btn" style="margin-left: 1rem">중복확인</button>
                    </div>
                    <div class="form-rows">
                        <label class="form-col-label" for="signup-name">이름</label>
                        <input type="text" id="signup-name" name="userName" placeholder="이름을 입력해주세요" class="signup-input">
                    </div>
                    <div class="form-rows">
                        <label for="signup-nicName" class="form-col-label">닉네임</label>
                        <input type="text" id="signup-nicName" name="userNicName" placeholder="닉네임을 입력해주세요" class="signup-input">
                    </div>
                    <div class="form-rows">
                        <label for="signup-password" class="form-col-label">비밀번호</label>
                        <input type="password" id="signup-password" name="userPw" placeholder="비밀번호를 입력해주세요" class="signup-input">
                        <div style="padding-top: .5rem; padding-left: 1rem">
                            <input type="checkbox" id="signup-password-show">
                            <label for="signup-password-show">비밀번호 표시</label>
                        </div>
                    </div>
                    <div class="form-rows">
                        <label for="signup-birth" class="form-col-label">생일</label>
                        <input type="date" id="signup-birth" name="userBirth">
                    </div>
                    <div class="form-rows">
                        <label for="signup-gender" class="form-col-label">성별</label>
                        <div style="padding-top: .5rem">
                            <input type="radio" id="signup-gender" name="userGender" value="man" class="">
                            <label for="signup-gender">남자</label>
                            <input type="radio" id="signup-gender-female" name="userGender" class="" value="woman">
                            <label for="signup-gender-female">여자</label>
                        </div>
                    </div>
                    <div class="form-rows">
                        <label for="signup-email" class="form-col-label">이메일</label>
                        <input type="email" id="signup-email" name="userEmail" class="signup-input">
                    </div>
                    <div class="form-rows">
                        <input type="checkbox" id="signup-check" name="userConsent" class="signup-check">
                        <label for="signup-check" class="check-label">이메일 수신 동의</label>
                    </div>
                </form>
            </div>
            <div style="margin-top:.875rem; margin-bottom:2rem; margin-right: 1rem">
                <div style="text-align: right">
                    <button type="button" class="btn" id="btnSignup">회원가입</button>
                    <button type="button" class="btn" id="btnCancel">취소</button>
                </div>
            </div>
        </div>
    </div>
</section>
</body>
</html>
