<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>全部用户</title>
		<style type="text/css">
			table{
				margin:0 auto;
				border:1px solid #808080;
				table-layout:fixed;
			    empty-cells:show; 
			    border-collapse: collapse;
			}
			table tr th{
				height: 30px;
				font-size: 17px;
				font-family: 微软雅黑;
			}
			table tr td{
				text-align: center;
				height: 28px;
				height: 30px;
				font-size: 15px;
				font-family: 微软雅黑;
				font-weight: 500;
			}
			
			table tr td a{
				text-decoration: none;
				color: black;
			}
		</style>
	</head>
	<body>
		<h2>全部用户</h2>
		<div style="margin-top: 30px; margin-left: 50px;">
			<table border="1" width="50%">
				<tr>
					<th>用户名</th>
					<th>性别</th>
					<th>年龄</th>
				</tr>
				<c:forEach items="${userList }" var="staff">
					<tr>
						<td>
							<a href="user.detail.do?id=${staff.id }">${staff.name }</a>
						</td>
						<td>${staff.sex }</td>
						<td>${staff.age }</td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</body>
</html>