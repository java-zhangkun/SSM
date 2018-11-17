<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'show.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

</head>

<body>
	<table border="1px">
		<th>名称</th>
		<th>价格</th>
		<th>数量</th>
		<c:forEach var="g" items="${requestScope.selectAll }">
			<tr>
				<td>${g.goodsName}</td>
				<td>${g.goodsPrice}</td>
				<td>${g.goodsNum}</td>
			</tr>
		</c:forEach>
	</table>
	<img alt="" src="resources/img/IMG_0158.JPG">
</body>

</html>
