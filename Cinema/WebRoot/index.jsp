<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>后台首页</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <frameset rows="25%,*">
  	<frame src="${pageContext.request.contextPath}/manager/head.jsp" name="head">
  	<frameset cols="20%,*">
  		<frame src="${pageContext.request.contextPath}/manager/nav.jsp" name="nav">
  		<frame src="${pageContext.request.contextPath}/manager/content.jsp" name="content">
  	</frameset>
  </frameset>
</html>
