<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-08
  Time: 오후 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

</body>
</html><%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-12-05
  Time: 오후 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<html>
<head>
  <title>UserList</title>
  <!-- Bootstrap CSS -->
  <link rel="stylesheet"
        href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
        integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
        crossorigin="anonymous">
  <%@include file="../../common/mainHead.jsp" %>

</head>
<body>
<%--헤더부분--%>
<%@include file="../../common/header.jsp" %>


<div class="container" style="max-width: 1600px">
  <h2 style="margin-top: 50px; margin-bottom: 20px">사용자 리스트</h2>

  <%--데이터 출력장소--%>
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
          <c:forEach var="list" items="${noticeList}">
            <tr>
              <td>${list.noticeNo}</td>
              <td>${list.noticeTitle}</td>
              <td>${list.userNicName}</td>
              <td>${list.noticeViews}</td>
              <td>${list.noticeDate}</td>
            </tr>
          </c:forEach>
        </c:when>
      </c:choose>
      </tbody>
    </table>
  </div>
  <%--페이징--%>
  <%--검색--%>
  <div class="form-group row justify-content-center">
    <div style="padding-right:10px">
      <select class="form-control form-control-sm" name="searchType" id="searchType">
        <option value="title" <c:if test="${pagination.searchType eq 'title'}">selected</c:if> >제목</option>
        <option value="content" <c:if test="${pagination.searchType eq 'content'}">selected</c:if>>본문</option>
        <option value="reg_id" <c:if test="${pagination.searchType eq 'reg_id'}">selected</c:if>>작성자</option>
      </select>
    </div>
    <div style="padding-right:10px">
      <input type="text" class="form-control form-control-sm" name="keyword" id="keyword" value="${pagination.keyword}">
    </div>
    <div>
      <button class="btn btn-sm btn-primary" name="btnSearch" id="btnSearch">검색</button>
    </div>
  </div>
</div>

</body>
</html>

