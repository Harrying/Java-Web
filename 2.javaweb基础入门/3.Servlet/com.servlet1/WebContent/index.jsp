<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%  
    String basePath=request.getScheme()+":"+"//"+request.getServerName()+":"+request.getServerPort()+"/"
    +request.getServletContext().getContextPath()+"/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆</title>
</head>
<body>
    <center>
        <form action="<%=basePath %>LoginServlet" method="post">
           <p>用户名:<input type="text" name="username"></p>
           <p>密&nbsp;码:<input type="password" name="password"></p>
           <p>
              <input type="submit" value="登陆">
              <input type="reset" value="重置">
           </p>
        </form>
    </center>
    
</body>
</html>