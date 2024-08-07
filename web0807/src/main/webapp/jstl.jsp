<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%
request.setAttribute("name", "홍길동");
request.setAttribute("money", 5000);
request.setAttribute("dataList", new String[]{"a", "b", "c"}); %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- JSTL if -->
<c:if test = "${name == '홍길동' }">
이름은 홍길동입니다.<br>
</c:if>
<c:choose>
	<c:when test = "${money >= 10000 }">
	돈 많아요.
	</c:when>
	<c:when test = "${money > 0 }">
	돈 조금 있어요
	</c:when>
	<c:otherwise>
	돈 하나도 없어요
	</c:otherwise>
	</c:choose>
	<br><br>
	<c:forEach var= "count" begin= "0" end="30" step = "3">
	${count}
	</c:forEach>
	<br>
	${sum = 0; ''}<br>
	<!-- 1부터 10까지 더하는 JSTL -->
	<c:forEach var="i" begin="0" end = "10" step ="1">
	${sum = sum + i; ''}
	</c:forEach>
	${sum }<br>
	<!-- 구구단 4단 출력 -->
	<c:forEach var="i" begin="1" end = "4">
	${i }단<br>
	<c:forEach var="j" begin= "1" end = "9">
	${i} x ${j} = ${i*j }<br>
	</c:forEach>
	</c:forEach>
</body>
</html>