<%--
  Created by IntelliJ IDEA.
  User: argon
  Date: 2022-11-28
  Time: 오후 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<aside class="aside-sidebar">
  <div class="sidebar">
    <div class="name">사용자 명</div>
    <loading-context class="loading-context">
      <div data-target="loading-context.details">
        <div class="dContainer">
          <h2 class="sideName"> Top 사전 <a class="createDictionary" href="#">생성</a></h2>
        </div>
        <div class="dictionary-search">
          <input class="dictionary-search-input" type="text" placeholder="사전 검색">
        </div>
        <ul class="dictionary-list">
          <li>사전리스트</li>
          <li>사전리스트</li>
          <li>사전리스트</li>
          <li>사전리스트</li>
        </ul>
      </div>
    </loading-context>
  </div>
</aside>
