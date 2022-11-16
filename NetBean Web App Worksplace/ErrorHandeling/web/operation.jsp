<%-- 
    Document   : operation
    Created on : 23-Oct-2022, 11:55:43 am
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
     <%
            //Scriptlet tag
            String num1 = request.getParameter("num1");
            String num2 = request.getParameter("num2");
            int n1=Integer.parseInt(num1);
            int n2 = Integer.parseInt(num2);
            int result = n1/n2;
        %>
        <body>
        <h1><%=result%></h1>
    </body>
</html>
