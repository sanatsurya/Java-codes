<%-- 
    Document   : FunctonTaglib
    Created on : 04-Nov-2022, 4:29:33 pm
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <c:set var="name" value="Million Dreams" scope="application"></c:set>
        <h1>hi <c:out value="${name}"></c:out></h1>
        <h1>Length of name is <c:out value="${fn:length(name)}"></c:out></h1>
        <h1>Is length contains s  in character <c:out value="${fn:contains(name,'s')}"></c:out></h1>
    </body>
</html>
