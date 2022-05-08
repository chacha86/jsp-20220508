<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="/web-test/css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body>
<div class="container"> 
	<table class="table">
		<thead>
			<tr class="table-dark table-hover">
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="article" items="${ articles }">
				<tr>
					<td>${ article.id }</td>
					<td>${ article.title }</td>
					<td>${ article.memberId }</td>
					<td>${ article.hit }</td>
					<td>${ article.regDate }</td>
				</tr>
			</c:forEach>
			</tbody>
	</table>
</div>
</body>
</html>