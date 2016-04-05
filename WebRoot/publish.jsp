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

	<form name="addExchangeForm" method="post" action="/exchange/addExchangeAction">
		<table border="0">
			<tr>
				<td>标题：</td>
				<td><input type="text" name="title"></td>
			</tr>
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>电话：</td>
				<td><input type="text" name="mobile"></td>
			</tr>
			<tr>
				<td>描述：</td>
				<td><input type="text" name="description"></td>
			</tr>
			<tr>
				<td><input type="Submit" value="发布"></td>
			</tr>
		</table>
	</form>

</body>
</html>
