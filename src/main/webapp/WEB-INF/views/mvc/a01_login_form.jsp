<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="path" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="${path}/a00_com/vendor/fontawesome-free/css/all.min.css" rel="stylesheet" type="text/css">
    <link
        href="https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i"
        rel="stylesheet">

    <!-- Custom styles for this template-->
<title>휴먼철도999 로그인</title>
<style>
body {
	font-family: Arial, sans-serif;
}

.login-container {
	width: 300px;
	margin: 100px auto;
	border: 1px solid #ccc;
	padding: 20px;
	box-shadow: 0px 0px 10px 0px #000;
	border-radius: 10px;
}

.login-container h2 {
	text-align: center;
}

.login-container input[type="text"], .login-container input[type="password"]
	{
	width: 92%;
	padding: 10px;
	margin: 10px 0;
	border: 1px solid #ccc;
	border-radius: 5px;
}

.login-container button {
	width: 100%;
	padding: 10px;
	background-color: #007bff;
	border: none;
	color: white;
	font-size: 16px;
	border-radius: 5px;
	cursor: pointer;
}

.login-container button:hover {
	background-color: #0056b3;
}

.login-container .links {
	text-align: center;
	margin-top: 10px;
	font-size: 12px;
}

.login-container .links a {
	margin: 0 5px;
	color: #007bff;
	text-decoration: none;
}

.login-container .links a:hover {
	text-decoration: underline;
}
</style>
</head>
<body>
	<div class="login-container">
		<h2>휴먼철도999 로그인</h2>
		<c:if test="${not empty error}">
			<p class="error-message">${error}</p>
		</c:if>
		<form method="post" class="user">
			<label for="userid">아이디</label> 
			<input type="text" id="userid"
				name="m_id" required> 
			<label for="password">비밀번호</label> 
			<input type="password" id="password"
				name="m_pwd" required>
			<!--
			<button type="submit">확 인</button>
			-->
			<a href="javascript:login()">
            Login
            </a>
			<div class="links">
				<a href="#">아이디 찾기</a> <a href="#">비밀번호 재설정</a> <a
					href="/htproject/999/Membership/a01_meaning.jsp">회원가입</a>
			</div>
		</form>
		<script type="text/javascript">
			function login() {
				$("form").submit();
			}
			var msg = "${msg}"
			if (msg != "") {
				alert(msg)
				if (msg == "로그인 성공") {
					alert("메인페이지 이동(프로세스)")
				}
			}
		</script>
	</div>
	<script src="${path}/a00_com/vendor/jquery/jquery.min.js"></script>
<script
	src="${path}/a00_com/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

<!-- Core plugin JavaScript-->
<script src="${path}/a00_com/vendor/jquery-easing/jquery.easing.min.js"></script>

<!-- Custom scripts for all pages-->
<script src="${path}/a00_com/js/sb-admin-2.min.js"></script>

<!-- Page level plugins -->
<script src="${path}/a00_com/vendor/chart.js/Chart.min.js"></script>

<!-- Page level custom scripts -->
<script src="${path}/a00_com/js/demo/chart-area-demo.js"></script>
<script src="${path}/a00_com/js/demo/chart-pie-demo.js"></script>
</body>
</html>
