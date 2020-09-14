<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 导入JSTL标签 -->
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">学生信息列表</h1>
	<table align="center" border="1px" width="70%" cellspacing="0px">
		<tr>
			<th>学号</th>
			<th>学生姓名</th>
			<th>身份证号码</th>
			<th>专业</th>
			<th>班级</th>
			<th>入学时间</th>
			<th>联系电话</th>
			<th>已修学分</th>
		</tr>
		<c:forEach items="${emps}" var="emp">
			<tr align="center">
				<td>${emp.studentId}</td>
				<td>${emp.name}</td>
				<td>${emp.identifyNo}</td>
				<td>${emp.profess}</td>
				<td>${emp.classs}</td>
				<td>${emp.enroTime}</td>
				<td>${emp.telNo}</td>
				<td>${emp.credit}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>