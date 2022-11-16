<%-- 
    Document   : index
    Created on : 25-Oct-2022, 9:46:17 am
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="/WEB-INF/tlds/c1TagLibrary"  prefix="t"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <t:Mytag></t:Mytag>
        <h1>Hello World!</h1>
        <t:table number="5" color="blue"></t:table>
        <t:table number="6" color="red"></t:table>
        <t:table number="27" color="green"></t:table>
        <form action="FilterServ" method="post">
            <input type="date" value="" name="cdt">
            <button type="submit">Submit</button>
        </form>
</html>
