<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-11-28
  Time: 오후 5:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<header id="header" class="header">
    <div>
        <a class="header-item header-link" href="http://localhost:8089/">Dlog</a>
    </div>
    <div class="header-item item">
        <div class="header-search">
            <div class="position-relative" style="">
                <form class="site-search-form" method="get">
                    <label class="header-search-wrapper">
                        <input type="text" class="header-search-input" placeholder="검색창">
                        <img src="/resources/img/icon0.png" width="22" height="22">
                    </label>
                </form>
            </div>
        </div>
        <nav class="nav">
            <a class="navigation-item" href="/">네비1</a>
            <a class="navigation-item" href="/">네비 1</a>
            <a class="navigation-item" href="/">네비 1</a>
        </nav>
    </div>
    <div class="header-item" style="display: flex !important; position: relative">
        <details class="details" style="display: block;">
            <summary class="header-link">
                <img src="/resources/img/userIcon.png" width="20" height="20">
                <span class="dropdown-create"></span>
            </summary>
            <details-menu class="dropdown-menu">
                <c:choose>
                    <c:when test="${empty userData}">
                        <a href="/loginForm" class="dropdown-item">로그인</a>
                    </c:when>
                    <c:when test="${!empty userData}">
                        <a href="/user/myPage" class="dropdown-item">마이페이지</a>
                        <a href="/logoutUser" class="dropdown-item">로그아웃</a>
                    </c:when>
                </c:choose>
            </details-menu>
        </details>
    </div>
</header>
