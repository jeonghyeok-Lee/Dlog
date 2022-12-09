<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-02
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>로그인 창</title>
    <%@include file="../common/mainHead.jsp" %>
    <link href="/resources/css/login/loginFrom.css" rel="stylesheet" type="text/css">
</head>
<body>

<%--헤더부분--%>
<%@include file="../common/header.jsp" %>

<%--메인 컨텐츠 부분--%>
<section class="login default-container">
    <div class="default-first-child login-main-container">
        <form method="post" class="login-form" id="login-form" action="/user/login.do">
            <div class="login-title">로그인</div>
            <article class="login-content">
                <div class="login-userid">
                    <div class="login-title id">UserID</div>
                    <input type="text" placeholder="아이디를 입력해주세요" class="userid login-input" name="userId">
                </div>
                <div class="login-password">
                    <div class="login-title pw">Password</div>
                    <input type="password" class="password login-input" name="userPw">
                </div>
                <div class="login-option-first">
                    <div class="autologin">
                        <input type="checkbox" id="checkbox" class="autologin-checkbox">
                        <label for="checkbox" class="autologin-title">자동 로그인</label>
                    </div>
                    <div class="find-id-pw">
                        <a href="#" class="">[아이디/비밀번호 찾기]</a>
                    </div>
                </div>
                <div class="login-option-second">
                    <a href="/signup" class="login-createUser margin-lr-10">계정 만들기</a>
                    <button class="login-btn" type="submit">
                        로그인
                    </button>
                </div>
            </article>
        </form>
    </div>
</section>


</body>
</html>
