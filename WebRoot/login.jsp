<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
  	
  	<form id="publishForm" name="publishForm" action="/exchange/loginAction" method="post">
  		<table border="0">
	  		<tr>
	  			<td>用户名:</td> <td><input id="username" name="username" type="text" /></td>
	  		</tr>
	  		<tr>
	  			<td>密码:</td> <td><input id="password" name="password" type="password" /></td>
	  		</tr>
	  		<tr>
	  			<td><input type="submit" value="提交" /></td>
	  		</tr>
  		</table>
  	</form>
  	
  </body>
</html>
