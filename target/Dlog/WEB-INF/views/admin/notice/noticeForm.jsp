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
    <title>공지사항 작성페이지</title>
    <%@include file="../../common/header.jsp"%>
    <link href="/resources/css/notice/noticeForm.css" rel="stylesheet" type="text/css">
    
</head>
<body>
<%@include file="../../common/mainHead.jsp"%>

<section class="default-container notice">
    <article class="default-first-child">
        <div class="notice-container">
            <div class="notice-main-title">공지사항 작성</div>
            <form method="post" class="notice-form">
                <div class="notice-title">
                    <label for="notice-title-input" class="notice-text">제목</label>
                    <input type="text" class="notice-title-input" id="notice-title-input" placeholder="제목">
                    <div class="notice-writer">
                        <div class="notice-text">작성자</div>
                        <div class="notice-text">작성자명</div>
                    </div>
                </div>
                <div class="notice-content">
                    <label for="notice-content-input" class="notice-text">본문내용</label>
                    <input type="text" id="notice-content-input"
                           class="notice-content-input"
                           placeholder="내용을 입력해주세요">
                </div>

                <div class="notice-btn-line">
                    <button type="submit" value="등록" class="notice-btn">등록</button>
                    <button type="button" onclick="" value="취소" class="notice-btn">취소</button>
                </div>
            </form>
        </div>
    </article>
</section>

</body>
</html>
