<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-11
  Time: 오후 11:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>공지사항 상세</title>
    <link href="/resources/css/notice/noticePage.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
          crossorigin="anonymous">
    <%@include file="../../common/mainHead.jsp" %>
</head>
<body>

<%--헤더부분--%>
<%@include file="../../common/header.jsp" %>

<section class="default-container" style="min-height: 100%">
    <div class="default-first-child">
        <div id="view" class="mt">
            <div id="prev-title"><h2>공지사항</h2></div>
            <hr class="border border-gray border-3"/>
            <div id="view-header" class="ml mr">
                <!-- 하드코딩 view-title -->
                <div id="view-title">
                    <div class="ib">
                        <span class="bold">${noticePage.noticeTitle}</span>

                        <div>
                            <!-- 하드코딩 view-author -->
                            <div id="view-author-block" class="ib subtitle">작성자 : <a src="#">
                                <div id="view-author" class="ib">
                                    ${noticePage.userNicName}
                                </div>
                            </a></div>
                        </div>
                    </div>

                    <!-- 하드코딩 view-insert-date, view-total -->
                    <div class="ib right">
                        <div id="view-total-block" class="subtitle tr">조회수 :
                            <div id="view-total" class="ib">
                                ${noticePage.noticeViews}
                            </div>
                        </div>
                        <div id="view-insert-date-block" class="ib subtitle">작성 시각 :
                            <div id="view-insert-date" class="ib">
                                ${noticePage.noticeDate}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <hr class="border border-gray border-3"/>
            <div id="view-path-block" class="ml mr">
                <!-- 하드코딩 view-url -->
                <a id="view-url" href="#" class="gray right">http://???.???.???.???:???/???????</a>
            </div>
            <div id="view-content-block" class="ml mr">
                <!-- 하드코딩 view-content -->
                <div id="view-content" class="mt">
                    ${noticePage.noticeContent}
                </div>
            </div>
            <hr class="border border-gray border-3"/>
            <div class="table-responsive">
                <table class="table table-striped">
                    <thead>
                    <tr>
                        <th>번호</th>
                        <th>제목</th>
                        <th>작성자</th>
                        <th>조회수</th>
                        <th>작성날짜</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:choose>
                        <%--데이터가 없다면--%>
                        <c:when test="${noticeList == null}">
                            <tr>
                                <td colspan="5" align="center">데이터가 없습니다.</td>
                            </tr>
                        </c:when>
                        <c:when test="${noticeList != null}">
                            <c:set var="noticeLength" value="${noticeList.size()}"/>
                            <c:forEach var="list" items="${noticeList}" varStatus="status">
                                <tr>
                                    <td>${noticeList[noticeLength-status.count].noticeNo}</td>
                                    <td>
                                        <a href="/noticePage/${noticeList[noticeLength-status.count].noticeNo}" class="">
                                                ${noticeList[noticeLength-status.count].noticeTitle}
                                        </a>
                                    </td>
                                    <td>${noticeList[noticeLength-status.count].userNicName}</td>
                                    <td>${noticeList[noticeLength-status.count].noticeViews}</td>
                                    <td>${noticeList[noticeLength-status.count].noticeDate}</td>
                                </tr>
                            </c:forEach>
                        </c:when>
                    </c:choose>
                    </tbody>
                </table>
            </div>
        </div>

    </div>
</section>

</body>
</html>
