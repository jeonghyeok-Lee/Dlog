<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-02
  Time: 오전 11:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>로그인 창</title>
    <link href="/resources/css/login/loginFrom.css" rel="stylesheet" type="text/css">
</head>
<body>
<article>
    <h1>로그인</h1>
    <from class="loginFrom">
        <div class="id-pw">
            <label for="userIdInput">ID</label>
            <input type="text" class="userIdInput" id="userIdInput">
        </div>
        <div class="id-pw">
            <label for="userPwInput">Password</label>
            <input type="password" class="userPwInput" id="userPwInput">
        </div>
        <div class="autoLogin">
            <label class="checkbox">
                <input type="checkbox">
                <span>자동 로그인</span>
            </label>
        </div>
        <a href="#" class="recovery">[아이디/비밀번호 찾기]</a>
        <div class="login">
            <a href="#">계정만들기</a>
            <button type="submit" class="">로그인</button>
        </div>
    </from>
</article>
</body>
</html>
