<%-- 
    Document   : Users.jsp
    Created on : 04-Nov-2022, 6:40:09 pm
    Author     : ASUS
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="db"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Details</title>
    </head>
    <body>
        <db:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/tdic?useSSL=false" user="root" password="User@1" var="ds"></db:setDataSource>
        <db:query dataSource="${ds}" var="rs">SELECT * FROM registration;</db:query>
        <table>
            <tr>
                <td>User id</td>
                <td>username</td>
                <td>email</td>
                <td>mobile</td>
            </tr>
        <c:forEach items="${rs.rows}" var="row">
            <tr>
                <td><c:out value="${row.id}"></c:out></td>
                <td><c:out value="${row.uname}"></c:out></td>
                <td><c:out value="${row.uemail}"></c:out></td>
                <td><c:out value="${row.umobile}"></c:out></td>
            </tr>
        </c:forEach>
        </table>
    </body>
</html>
