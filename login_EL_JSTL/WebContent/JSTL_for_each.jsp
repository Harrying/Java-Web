<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>通过jstl和EL表达式迭代List集合</title>
</head>
<body>
	
	<table align="center" border="1px" cellspacing="0px" style="width: 80%;
		text-align: center;background-color: yellow">
			<tr>
				<td>商品名称</td>
				<td>产地</td>
				<td>价格</td>
			</tr>
			<c:forEach items="${lists }" var="Map">
				<tr>
					<td>${Map.shopName}</td>
					<td>${Map.address}</td>
					<td>${Map.price}</td>
				</tr>
			</c:forEach>
		</table>
</body>
</html>