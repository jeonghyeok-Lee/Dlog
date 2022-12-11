<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-09
  Time: 오후 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>마이페이지</title
    <%@include file="../common/mainHead.jsp" %>
    <link href="/resources/css/every/mainSide.css" rel="stylesheet" type="text/css">
    <link href="/resources/css/myPage.css" rel="stylesheet" type="text/css">
</head>
<body>
<%--header부분 생성--%>
<%@include file="../common/header.jsp" %>

<section class="default-container">
    <%@include file="../common/mainSide.jsp"%>
    <div class=" default-first-child">
        <article class="container">
            <div class="title common">
                <span class="title-context">마이 페이지</span>
            </div>
        </article>
        <article class="container">
            <div class="myDictionary-list common">
                <div class="container-line">
                    <div class="title-name  margin-tb-10 margin-lr-10">
                        <a href="#" class="">
                            내 사전
                        </a>
                    </div>
                    <div class="contents-list  margin-tb-10 margin-lr-10">
                        <c:choose>
                            <c:when test="${empty dictionaryList}">
                                <div class="non-dictionary">만든 사전이 없습니다.</div>
                            </c:when>
                            <c:when test="${!empty dictionaryList}">
                                <div class="default-container">
                                    <c:forEach var="list" items="${dictionaryList}" varStatus="status">
                                        <div class="">
                                            <a href="#" class="">${dictionaryList.dName}</a>
                                        </div>
                                    </c:forEach>
                                </div>
                            </c:when>
                        </c:choose>
                    </div>
                </div>
            </div>
        </article>
        <article class="container">
            <div class="myDictionary-list common">
                <div class="">
                    <div class="title-name margin-tb-10 margin-lr-10">
                        <a href="#" class="">
                            구독한 사전
                        </a>
                    </div>
                    <div class="contents-list  margin-tb-10 margin-lr-10">
                        <c:choose>
                            <c:when test="${empty dictionaryList}">
                                <div class="non-dictionary">구독한 사전이 없습니다.</div>
                            </c:when>
                            <c:when test="${!empty dictionaryList}">
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
