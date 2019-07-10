<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL常用标签</title>
</head>
<body>
	<!-- set out remove -->
		<!-- set 在指定的域中存放数据 -->
		<c:set var="user" value="张三" scope="request"></c:set>
		<!-- out 将数据打印显示 -->
		<c:out value="${user}"></c:out>
		<hr>
		<!-- remove 删除指定域中的指定数据-->
		<c:remove var="user" scope="request"/>
		<c:out value="${user}"></c:out> 
	
	
	<hr><hr>
	<!-- if标签  test属性接判断的条件 如果条件为true 则执行标签体中的内容 -->
	<c:set var="age" value="12" scope="request"></c:set>
	<c:if test="${age<18}">
		您未成年
	</c:if>
	
	
	<hr><hr>
	<!-- choose标签 相当于if-else -->
	<c:choose>
		<c:when test="${age==12 }">
		您的年龄为12岁
		</c:when>
		<c:otherwise>
		您的年龄不为12岁
		</c:otherwise>
	</c:choose>
	
	
	
	
	
</body>
</html>