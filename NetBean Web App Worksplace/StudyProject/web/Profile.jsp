<%@page import="com.study.entity.UserTable"%>
<%@page errorPage="errorpage.jsp" %>
<%
    
    
//    if(user==null){
//        response.sendRedirect("login.jsp");
//    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="Master.jsp" %>
        <%= user.getUname()%>
        <br>
        <%= user.getUemail()%>
        <br>
        <%=user.getUgender()%>
    </body>
</html>
