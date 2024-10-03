<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
${lists}

your name is ${name}

<c:forEach var="mylist" items="${lists}">
<div>${mylist}</div>
</c:forEach>
</body>
</html>