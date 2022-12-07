<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Dlog</title>
    <%@include file="common/mainHead.jsp" %>
    <link href="/resources/css/mainPage.css" rel="stylesheet" type="text/css">
    <link href="/resources/css/mainSide.css" rel="stylesheet" type="text/css">
</head>
<body>
<%--header부분 생성--%>
<%@include file="common/header.jsp" %>

<%--메인부분--%>
<section class="mainContent default-container">
    <%@include file="common/mainSide.jsp"%>
    <div class="article-container default-first-child">
        <article class="container">
            <div class="title common">
                <span class="title-context"> 사전을 제작하는 Dlog에 오신 것을 환영합니다.</span>
            </div>
        </article>
        <article class="container">
            <div class="admission-code common">
                <div class="">
                    <div class="admission-code-title">Dlog 입장 코드</div>
                    <input type="text" class="code-input">
                    <div class="hint">입장 코드를 입력해주세요</div>
                </div>
            </div>
        </article>
        <article class="container">
            <div class="notification common">
                <div class="notification-container">
                    <div class="title-name margin-tb-10 margin-lr-10">
                        <a href="#" class="">
                            공지사항
                        </a>
                    </div>
                    <div class="contents-list margin-tb-10 margin-lr-10">
                        <c:choose>
                            <c:when test="${empty notification}">
                                <div class="non-notification">공지사항이 없습니다.</div>
                            </c:when>
                            <c:when test="${!empty notification}">
                                <c:forEach var="notice" items="${notification}">
                                    <%--개수제한 필요--%>
                                    <a href="/notice/${notice.noticeNo}"
                                       class="contents-list-link">${notice.noticeName}</a>
                                </c:forEach>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
            </div>
        </article>
        <article class="container">
            <div class="popular-list common">
                <div class="popular-list-container">
                    <div class="title-name  margin-tb-10 margin-lr-10">
                        <a href="#" class="">
                            인기사전
                        </a>
                    </div>
                    <div class="contents-list  margin-tb-10 margin-lr-10">
                        <c:choose>
                            <c:when test="${empty dictionaryList}">
                                <div class="non-dictionary">인기사전이 없습니다.</div>
                            </c:when>
                            <c:when test="${!empty dictionaryList}">
                                <c:forEach var="dictionary" items="${dictionaryList}">
                                    <a href="/dictionary/${dictionary.dNo}"
                                       class="contents-list-link">${dictionary.dName}</a>
                                </c:forEach>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
            </div>
        </article>

    </div>
</section>

</body>
</html>
