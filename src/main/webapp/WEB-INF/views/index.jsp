<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Dlog</title>
    <style>
        nav{
            background-color: #339999;
            color: white;
            width: 200px;
            height: 100%;
            float: left;
        }
        section{
            background-color: skyblue;
            width: 200px;
            text-align: left;
            float: left;
            padding: 10px;
        }
        article{
            border: 1px solid black;
        }
    </style>
    <link href="/resources/css/header.css" rel="stylesheet" type="text/css">
    <link href="/resources/css/nav.css" rel="stylesheet" type="text/css">
</head>
<body>
    <header>
        <jsp:include page="header/mainHeader.jsp"></jsp:include>
    </header>
    <nav>
        <h2>Nav</h2>
    </nav>
    <section>
        <p>Section</p>
        <article>
            <h3>article1</h3>
        </article>
        <article>
            <h3>article1</h3>
        </article>
    </section>
</body>
</html>
