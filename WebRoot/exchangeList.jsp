<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<title>闲置物品交易信息发布网</title>
<!-- for-mobile-apps -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Flat Accordion Widget Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-mobile-apps -->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<link href='//fonts.googleapis.com/css?family=Philosopher:400,400italic,700,700italic' rel='stylesheet' type='text/css'>
</head>
<body>
	<!-- main -->
		<div class="main">
			<h1>闲置物品交易信息发布网</h1>
			<section class="ac-container">
				<div>
					<input id="ac-1" name="accordion-1" type="checkbox" checked="true" disabled="true" />
					<label for="ac-1" class="grid3">
						<i></i>
							<c:if test="${user != null}">
								您好，亲爱的 <c:out value="${user.nickname}" />  <a href="publish.jsp">发布信息</a>
	  						</c:if>
						  	
						  	<c:if test="${user == null}">
  								您好，亲爱的用户 <a href="login.jsp">登录</a>
  							</c:if>
					</label>
					<article class="ac-small">
						<ul>
							<c:forEach items="${results}" var="result">
								<li>${result.title}  ${result.description}	${result.name}  ${result.mobile}
								<c:if test="${user != null && user.username == result.name}">
									&nbsp;&nbsp;<a href="deleteExchangeAction?exchangeId=${result.id}" >下线</a>
								</c:if>
								<c:if test="${user != null && user.username == 'admin'}">
									&nbsp;&nbsp;<a href="deleteExchangeAction?exchangeId=${result.id}" >删除</a>
								</c:if>
								</li>
							</c:forEach>
						</ul>
					</article>
				</div>
			</section>
		</div>
	<!-- main -->
</body>
</html>