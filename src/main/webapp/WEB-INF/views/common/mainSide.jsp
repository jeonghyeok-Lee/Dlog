<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-11-28
  Time: 오후 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<aside class="aside-sidebar">
  <div class="sidebar">
    <c:if test="${!empty userData}">
      <div class="name">${userData.userNicName}</div>
      <loading-context class="loading-context">
        <div data-target="loading-context.details">
          <div class="dContainer">
            <h2 class="sideName"> Top 사전 <a class="createDictionary" href="#">생성</a></h2>
          </div>
          <div class="dictionary-search">
            <input class="dictionary-search-input" type="text" placeholder="사전 검색">
          </div>
          <ul class="dictionary-list">
            <c:forEach var="list" items="${dictionaryList}">
              <div>${list.dName}</div>
            </c:forEach>
          </ul>
        </div>
      </loading-context>
    </c:if>
    <c:if test="${empty userData}">
      <div class="name"><a href="/loginForm">로그인 후에 이용해주세요</a></div>
    </c:if>
  </div>
</aside>
