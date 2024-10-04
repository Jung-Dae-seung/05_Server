<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	
	<%-- css 파일 연결 (webapp 폴더 기준으로 경로 작성) --%>
	<link rel="stylesheet" href="/resources/css/main.css">
</head>
<body>

	<h1>Todo List</h1>
	<h3>전체 Todo 개수 : ${fn:length(todoList)}</h3>

	<hr>
	<h4>할 일 추가</h4>
	<form action="/todo/add" method="post" id="addForm">
		<div>
			제목 : <input type="text" name="title">
		</div>
		<div>
			<textarea name="detail" rows="3" cols="50" placeholder="상세 내용"></textarea>
		</div>
		<button>추가</button>
	</form>

	<%-- 할 일 목록 출력 --%>
	<table id="todoList" border="1">
		<thead>
			<tr>
				<th>번호</th>
				<th>할 일 제목</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todoList}" varStatus="vs" var="todo">
				<tr>
					<th>${vs.count}</th>
					<td>
						<a href="/todo/detail?index=${vs.index}">${todo.title}</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<%-- session 범위에 message가 있을 경우 --%>
	<c:if test="${empty sessionScope.message}">
		<script>
			alert("${message}");
			// JSP 해석 순서
			// 1순위 : Java(EL/JSTL)
			// 2순위 : Front(HTML, CSS, JS)
		</script>
		
		<%-- message를 한 번만 출력하고 제거 --%>
		<c:remove var="message"/>
		
	</c:if>
	
	
	<%-- JS 연결 --%>
	<script type="text/javascript" src="/resources/js/main.js"></script>

</body>
</html>