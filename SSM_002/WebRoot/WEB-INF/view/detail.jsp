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

<title>My JSP 'detail.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<!-- <link rel="stylesheet" type="text/css" href="styles.css"> -->
<link rel="stylesheet" type="text/css" href="resources/layui/css/layui.css">
<link rel="stylesheet" type="text/css" href="resources/css/index.css">
<script type="text/javascript" src="resources/js/jQuery.js"></script>
<script type="text/javascript" src="resources/layui/layui.js"></script>
<script type="text/javascript">
	function loadData(page) {
		$("#page").val(page);
		$("#myform").sumit();
	}
</script>
</head>

<body>
	<button class="layui-btn layui-btn-normal">百搭按钮</button>
    <button class="layui-btn layui-btn-warm">暖色按钮</button>
    <button class="layui-btn layui-btn-danger">警告按钮</button>
    <button class="layui-btn layui-btn-disabled">禁用按钮</button>
	<form id="myform" action="goods/findAll" method="post">
		<c:forEach items="${requestScope.list.list}" var="g">
			<div>
				<dl>
					<dt>
						<img src="upfile/img/${g.goodsImg}" />
					</dt>
					<dd>
						<h1>商品名称：${g.goodsName}</h1>
					</dd>
					<dd>
						<h3>商品价格：${g.goodsPrice}</h3>
					</dd>
					<dd>
						<h3>商品数量：${g.goodsNum}</h3>
					</dd>
					<dd>
						<h3>商品日期：${g.goodsDate}</h3>

					</dd>
				</dl>
			</div>
		</c:forEach>
		<div style="clear: both;">
			<input id="page" name="page"
				value="${requestScope.pageInfo.pageNum }"> 每页显示<input
				name="size" id="size" value="6">条
			当前是第${requestScope.list.pageNum}页 总共${requestScope.list.total}条
			总共${requestScope.list.pages}页

			<c:if test="${not requestScope.list.isFirstPage}">
				<a href="javascript:void(0)" onclick="loadData(1)">首页</a>
				<a href="javascript:void(0)"
					onclick="loadData(${requestScope.list.prePage})">上一页</a>
			</c:if>

			<c:if test="${not requestScope.list.isLastPage} ">
				<a href="javascript:void(0)"
					onclick="loadData(${requestScope.list.nextPage})">下一页</a>
				<a href="javascript:void(0)"
					onclick="loadData(${requestScope.list.Pages})">末页</a>
			</c:if>
		</div>
	</form>
</body>
</html>
