<%-- 
    Document   : taglib
    Created on : 03-Nov-2022, 4:57:26 pm
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL COre tags</title>
    </head>
    <body>
        <!-- set tag -->
        <c:set var='i' value="50" scope="application"></c:set>
        <!-- out tag -->
        <h1><c:out value="${i}"></c:out></h1>
        <!-- remove -->
        <!--<c:remove var="j"></c:remove>-->
        <h1><c:out value="${i}">This is default value</c:out></h1>
        <!-- 4.if -->
        <c:if test="${i==50}">
            <h3>the value is true</h3>
        </c:if>
        <!-- switch case -->
        <c:choose>
            <c:when test="${i>20}">
                <h1>this is greater than 20</h1>
            </c:when>
            <c:when test="${i<20}">
                <h2>this is less than 20</h2>
            </c:when>
            <c:otherwise>
                <h2>No condition is matched to the current tag</h2>
            </c:otherwise>
        </c:choose>
                <!-- for each -->
        <c:forEach var="j" begin="1" end="5" >
            <h1> Values of j out is <c:out value="${j}"></c:out></h1>
        </c:forEach>
            <!-- url redirect -->
        <c:url var="myurl" value="https://www.google.co.in/search">
            <c:param name="q" value="sanat surya mallick"></c:param>
        </c:url>
        <c:redirect url="${myurl}"></c:redirect>
    </body>
</html>
