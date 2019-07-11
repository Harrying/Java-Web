<%--
  Created by IntelliJ IDEA.
  User: hairui
  Date: 2019/07/10
  Time: 20:24
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>关于验证码框架之---Kaptcha</title>
</head>
<body>
    <form action="submit.action">
        <input type="text" name="kaptcha" value="" />
        <img src="http://localhost:8888/verificationCode/kaptcha.jpg" />
    </form>
</body>
</html>
