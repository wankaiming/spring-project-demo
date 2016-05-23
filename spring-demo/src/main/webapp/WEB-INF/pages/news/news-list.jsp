<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../common/taglibs.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>资讯列表</title>
</head>
<body>
<%@include file="../common/header.jsp" %>

<div style="padding:10px 20px 10px 20px;">
    <ul>
        <c:forEach items="${newsList}" var="item" varStatus="idx">
        <li><a href="${basePath}/news/info?id=${item.id}">${item.title}</a></li>
        </c:forEach>
    </ul>
</div>

<%@include file="../common/footer.jsp" %>
</body>
</html>