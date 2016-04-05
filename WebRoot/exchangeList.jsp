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
  	
  	<c:if test="${user != null}">
  		您好，亲爱的用户 <c:out value="${user.username}" />  <a href="publish.jsp">发布信息</a>
  	</c:if>
  	
  	<c:if test="${user == null}">
  		您好，亲爱的用户 <a href="login.jsp">登录</a>
  	</c:if>
  	
  	
	<table border="0">
	<tr><td>标题</td><td>用户</td><td>电话</td><td>描述</td></tr>
	<c:forEach items="${results}" var="result">
	<tr>
		<td>${result.title}</td><td>${result.name}</td><td>${result.mobile}</td><td>${result.description}</td>
	</tr>
	</c:forEach>
	</table>

</body>
</html>
