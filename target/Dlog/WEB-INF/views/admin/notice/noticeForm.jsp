<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-09
  Time: 오전 1:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>공지사항</title>
    <link rel="stylesheet"
          href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
          integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
          crossorigin="anonymous">
    <link href="/resources/css/notice/noticeForm.css" rel="stylesheet" type="text/css">
    <script defer src="/resources/templates/smarteditor/js/HuskyEZCreator.js" charset="UTF-8"></script>
    <script defer src="/resources/js/notice/noticeForm.js"></script>
    <%@include file="../../common/mainHead.jsp" %>

</head>
<body>
<%@include file="../../common/header.jsp" %>
<section class="default-container notice">
    <article class="default-first-child">
        <div id="view" class="mt notice-contain">
            <div id="prev-title">
                <h2 style="padding-left: 1rem; padding-top: 2rem">공지사항</h2>
            </div>
            <hr class="border border-gray border-3"/>
            <div id="view-writing-block" class="ml mr">
                <!-- 하드코딩 view-writing -->
                <div id="view-writing" class="view-writing">
                    <!-- <h3>Naver Smart Editor 2.0</h3> -->
                    <form method="post" action="./insertNotice"
                          id="notice-form"
                          accept-charset="UTF-8">
                        <div class="input-group mb-3 input-title-group">
                            <span class="input-group-text input-title" id="basic-addon1">제목</span>
                            <input type="text" name="title"
                                   class="form-control form-input-title"
                                   placeholder="Title" aria-label="Title"
                                   aria-describedby="basic-addon1"
                                   id="view-writing-title"
                            >
                            <div class="input-writer">
                                <span class="input-group-text input-writer-title">작성자</span>
                                <div class="input-writer-name">${userData.userNicName}</div>
                            </div>
                        </div>
                        <div id="smarteditor">
                            <textarea name="txt" id="editorTxt"
                                      rows="20" cols="10"
                                      placeholder="내용을 입력해주세요"
                                      style="width: 100%">
                            </textarea>
                        </div>
                        <input type="hidden" id="userNo"  name="userNo" value="${userData.userNo}">
                        <div style="margin-top: 1rem; margin-right:.5rem; text-align: right">
                            <input type="button" id="btnOk" class="btn btn-primary" value="저장"/>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </article>
</section>

</body>
</html>
