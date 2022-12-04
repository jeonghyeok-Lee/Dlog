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
<header>
    <jsp:include page="/WEB-INF/views/header/mainHeader.jsp"/>
</header>
<article>
    <h1>로그인</h1>
    <from class="loginFrom">
        <div class="">
            <label for="userIdInput">ID</label>
            <input type="text" class="userIdInput" id="userIdInput">
        </div>
        <div class="">
            <label for="userPwInput">Password</label>
            <input type="text" class="userPwInput" id="userPwInput">
        </div>
    </from>
</article>
</body>
</html>
