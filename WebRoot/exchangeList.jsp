<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>闲置物品交易网</title>
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
  	
	<table border="0">
	<tr><td>标题</td><td>用户</td><td>电话</td><td>描述</td></tr>
	<c:forEach items="${results}" var="result">
	<tr>
		<td>${result.title}</td><td>${result.name}</td><td>${result.mobile}</td><td>${result.description}</td>
	</tr>
	</c:forEach>
	</table>
	
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
 <td>电话： </td>
 <td><input type="text" name="mobile"></td>
 </tr>
 <tr>
 <td>描述： </td>
 <td><input type="text" name="description"></td>
 </tr>
 <tr><td><input type="Submit" value="发布"></td></tr>
</table>
</form>

</body>
</html>
