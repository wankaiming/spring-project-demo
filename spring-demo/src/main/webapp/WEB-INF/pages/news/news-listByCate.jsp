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
        <c:forEach items="${newsList}" var="newsCate" varStatus="idx">
        <li><a href="${basePath}/news/list?cateId=${newsCate.id}">${newsCate.name}</a></li>
        
            <ul>
                <c:forEach items="${newsCate.newsList}" var="news" varStatus="idx_1">
                <li><a href="${basePath}/news/info?id=${news.id}">${news.title}</a></li>
                </c:forEach>
            </ul>
        
        </c:forEach>
    </ul>
</div>

<%@include file="../common/footer.jsp" %>
</body>
</html>