<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>JSTL 테스트</h1>

<c:forEach var="i" begin="1" end="10" step="1">
	${ i }
</c:forEach>

<c:forEach var="str" items="${slist}">
	${str}
</c:forEach>

<c:set var="age" value="12" />

<c:if test="${age < 20}">
	할인 대상입니다.
</c:if>

<c:if test="${age >= 20}">
	할인 대상이 아닙니다.
</c:if>

<!-- 터널 3개. 각각 높이가 t1, t2, t3. 자동차 높이가 170일 때, 자동차가 통과하는지 충돌하는지 판단. -->

<c:set var="t1" value="172" />
<c:set var="t2" value="176" />
<c:set var="t3" value="182" />

<c:choose>
	<c:when test="${t1 <= 170}">
		CRASH
	</c:when>
	<c:when test="${t2 <= 170}">
		CRASH
	</c:when>
	<c:when test="${t3 <= 170}">
		CRASH
	</c:when>
	<c:otherwise>
		PASS
	</c:otherwise>
</c:choose>


</body>
</html>