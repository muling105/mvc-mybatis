<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();//
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页</title>
</head>
<body>
	
	<div style="margin: 0 auto;">
		<a href="<%=basePath%>user.preAdd.do">跳转到添加用户页面</a>
	</div>
	<p/>
	<a href="<%=basePath%>user.getAll.do">所有用户页面</a>
	<p/>
	<a href="<%=basePath%>abc.getAll.do">不存在的页面-4-4</a>
</body>
</html>