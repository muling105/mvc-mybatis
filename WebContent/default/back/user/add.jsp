<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加用户</title>
</head>
<body>

	<div style="margin-top: 30px; text-align: center;">
		<form action="user.doAdd.do" method="post">
			用户名：<input name="name" />
			<p/>
			性别：<input name="sex" />
			<p/>
			年龄：<input name="age" />
			<p/>
			<input type="submit" value="提交"/>
		</form>
	</div>

</body>
</html>