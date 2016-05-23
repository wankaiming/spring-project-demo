<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>资讯内容</title>
</head>
<body>
<%@include file="../common/header.jsp" %>

<div style="padding:10px 20px 10px 20px;">
    
    <div><c:out value="${info.title}"></c:out></div>
    <div><c:out value="${info.cont}"></c:out></div>
    
</div>

<%@include file="../common/footer.jsp" %>
</body>
</html>