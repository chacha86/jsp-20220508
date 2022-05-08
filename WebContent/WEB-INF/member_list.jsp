<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/web-test/css/bootstrap.min.css" />
</head>
<body>
<div class="container"> 
	<table class="table">
		<thead>
			<tr class="table-dark table-hover">
				<th>번호</th>
				<th>아이디</th>
				<th>실명</th>
				<th>닉네임</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="member" items="${ members }">
				<tr>
					<td>${ member.id }</td>
					<td>${ member.loginId}</td>
					<td>${ member.realName }</td>
					<td>${ member.nickName }</td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
</div>
</body>
</html>