<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입 결과</title>
</head>
<body>
	
	<h1>회원 가입 결과 페이지 입니다</h1>

	<h2>입력되어 전달된 값들</h2>
	
	<ul>
		<li>
			ID : <%= request.getParameter("inputId") %>
		</li>
		<li>
			PW : <%= request.getParameter("inputPw") %>
		</li>
		<li>
			확인 : <%= request.getParameter("inputPwCh") %>
		</li>
		<li>
			이름 : <%= request.getParameter("inputName") %>
		</li>
		<li>
			나이 : <%= request.getParameter("inputAge") %>
		</li>
	</ul>
	
	<c:if test="${param.inputPw == param.inputPwCh}">
		<h1>비밀번호 일치</h1>
	</c:if>
	
	<c:if test="${param.inputPw != param.inputPwCh}">
		<h1 style="color: red;">비밀번호 불일치</h1>
	</c:if>
	
	

</body>
</html>