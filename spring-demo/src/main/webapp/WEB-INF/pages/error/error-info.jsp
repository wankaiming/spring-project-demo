<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>错误信息</title>
</head>
<body>
<%@include file="../common/header.jsp" %>

<div style="padding:10px 20px 10px 20px;">
	<c:out value="${msg}"></c:out>
</div>

<%@include file="../common/footer.jsp" %>
</body>
</html>