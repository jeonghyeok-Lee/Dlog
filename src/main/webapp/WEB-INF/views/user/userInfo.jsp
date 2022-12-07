<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-11-30
  Time: 오전 10:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>학생정보</h2>[<a href="/UserController">새로고침</a>]
<hr>
<table border = "1">
    <tr>
        <th>번호</th>
        <th>ID</th>
        <th>PW</th>
        <th>이름</th>
        <th>생일</th>
        <th>이메일</th>
        <th>동의여부</th>
    </tr>
    <c:forEach items="${userList}" var = "user">
        <tr>
            <td>${user.userNo}</td>
            <td>${user.userId}</td>
            <td>${user.userPw}</td>
            <td>${user.userName}</td>
            <td>${user.userBirth}</td>
            <td>${user.userEmail}</td>
            <td>${user.userConsent}</td>
        </tr>
    </c:forEach>
</table>
<hr>

<h2>학생 추가</h2>
<hr>
<form method ="post" action="/UserController?action=insert">
    <label>이름</label><input type="text" name="username"><br>
    <label>대학</label><input type="text" name="univ"><br>
    <label>생일</label><input type="text" name="birth"><br>
    <label>이메일</label><input type="text" name="email"><br>
    <button type="submit">등록</button>
</form>
</body>
</html>
