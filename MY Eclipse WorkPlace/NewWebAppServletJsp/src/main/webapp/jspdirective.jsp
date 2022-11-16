
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page errorPage="errorpage.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directives of jsp</title>
</head>
<body>
 // <%//@include file="register.jsp" %>
	<%!
	//diclarative tag- used to diclar for methors and variables
		String name ="sanat";
		StringBuffer sb= new StringBuffer(name);
	%>
	<%
		//scriplet tag
	%>
	<%=""
	//expresiion tag
	%>
	<!-- directive tags
	1.page directive
	2.Include directive
	3.Taglib Directive
		 -->
		 <%@page import="java.util.ArrayList, java.util.Random" %>
	<h1>
	random number is : division is
		<%
			//Random r = new Random();
			//int n = r.nextInt(15);
			int u= 901;
			int div =u/0;
		%>
		 
		<%= div %>
		
	</h1>
	
	<!-- <p>current date is <%--<%=new Date().toString() %>--%></p> -->
</body>
</html>