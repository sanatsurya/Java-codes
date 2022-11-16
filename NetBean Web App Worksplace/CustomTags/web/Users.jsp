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
        <!-- boots strap css -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <!-- boots strap js -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        
    </head>
    <body>
        <db:setDataSource driver="com.mysql.jdbc.Driver" url="jdbc:mysql://localhost:3306/tdic" user="root" password="User@1" var="ds"></db:setDataSource>
        <db:query dataSource="${ds}" var="rs">SELECT * FROM registration;</db:query>
        <div class="container">
        <table class="table">
            <tr class="">
                <th scope="col">User id</th>
                <th scope="col">username</th>
                <th scope="col">email</th>
                <th scope="col">mobile</th>
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
        </div>
    </body>
</html>
