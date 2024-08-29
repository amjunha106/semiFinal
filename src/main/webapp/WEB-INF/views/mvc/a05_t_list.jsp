<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="java.util.*"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="path" value="${pageContext.request.contextPath }"/>
<fmt:requestEncoding value="utf-8"/>     
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>운행하는 열차 목록</title>
<link rel="stylesheet" href="${path}/a00_com/jquery-ui.css" >
<link rel="stylesheet" href="${path}/semi-final/styles.css">
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
    }

    header {
        background-color: #2980b9;
        color: white;
        padding: 20px 0;
        text-align: center;
        box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
    }

    .logo h1 {
        margin: 0;
        font-size: 24px;
    }

    .user-buttons33 {
        text-align: center;
        margin-top: 10px;
    }

    .user-buttons33 .upt-button33 {
        background-color: white;
        color: #2980b9;
        border: none;
        padding: 10px 20px;
        border-radius: 4px;
        cursor: pointer;
        font-size: 16px;
        transition: background-color 0.3s ease;
    }

    .user-buttons33 .upt-button33:hover {
        background-color: #ddd;
    }

    nav.nav33 {
        background-color: #34495e;
        color: white;
        padding: 10px 0;
        text-align: center;
        margin-bottom: 20px;
    }

    nav.nav33 h2 {
        margin: 0;
        font-size: 20px;
    }

    main {
        max-width: 800px;
        margin: 0 auto;
        padding: 20px;
        background-color: white;
        border-radius: 8px;
        box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }

    .main-content {
        margin-bottom: 40px;
    }

    .ppap33 {
        margin-bottom: 10px;
        padding: 10px;
        background-color: #ecf0f1;
        border-radius: 4px;
        font-size: 16px;
    }

    .ppap33:nth-child(odd) {
        background-color: #e0e0e0;
    }
</style>
<script src="${path}/a00_com/jquery.min.js"></script>
<script src="${path}/a00_com/popper.min.js"></script>
<script src="${path}/a00_com/jquery-ui.js"></script>
<script src="https://cdn.jsdelivr.net/npm/vue/dist/vue.js"></script>
<script src="https://developers.google.com/web/ilt/pwa/working-with-the-fetch-api" type="text/javascript"></script>
<script type="text/javascript">
    $(document).ready(function(){
    
    });
</script>
</head>

<body>
<header>
    <div class="logo">
        <h1>휴먼철도 999</h1>
    </div>
    <div class="user-buttons33">
        <button class="upt-button33" onclick="location.href='semi-final/MainHome.jsp'">메인페이지로 이동</button>
    </div>
</header>
<nav class="nav33">
    <ul>
        <h2>운행하는 열차목록</h2>
    </ul>
</nav>
    <section class="main-content">
        <c:forEach var="tt" items="${t_info }">
        <div class="ppap33">
            <p>열차번호: ${tt.t_num}</p>
            <p>열차종류: ${tt.train_type}</p>
            <p>출발지: ${tt.train_depart}</p>
            <p>도착지: ${tt.train_arrive}</p>
            <p>출발시간: ${tt.train_go}</p>
            <p>도착시간: ${tt.train_stop}</p>
            <p>탑승지: ${tt.train_rounge}</p>
        </div>
        </c:forEach>
    </section>
</body>
</html>
