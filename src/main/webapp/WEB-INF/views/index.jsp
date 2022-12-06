<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dlog</title>
    <%@include file="common/mainHead.jsp" %>
    <link href="/resources/css/mainPage.css" rel="stylesheet" type="text/css">
</head>
<body>
<%--header부분 생성--%>
<%@include file="common/header.jsp" %>

<%--메인부분--%>
<section class="mainContent">
    <article class="container">
        <div class="title common">
            <span class="title-context"> 사전을 제작하는 Dlog에 오신 것을 환영합니다.</span>
        </div>
    </article>
    <article class="container">
        <div class="admission-code common">
            <div class="">
                <div class="">Dlog 입장 코드</div>
                <input type="text" class="code-input">
                <div class="">입장 코드를 입력해주세요</div>
            </div>
        </div>
    </article>
    <article class="container">
        <div class="notification common">
            <div class="notification-container">
                <div class="title-name">
                    공지사항
                </div>
                <div class="contents-list">
                    <a href="#" class="">최근 공지사항 제목입니다.</a>
                </div>
            </div>
        </div>
    </article>
    <article class="container">
        <div class="popular-list common">
            <div class="popular-list-container">
                <div class="title-name">인기 사전</div>
                <div class="contents-list">
                    <a href="#" class="">인기사전 리스트가 출력될 예정입니다.</a>
                </div>
            </div>
        </div>
    </article>
</section>

</body>
</html>
