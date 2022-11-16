<%-- 
    Document   : codegeneraor
    Created on : 18-Oct-2022, 9:29:39 pm
    Author     : ASUS
--%>

<%@page import="javax.xml.ws.Response"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CodeGenerator</title>
        
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
            
    </head>
    <body>
        
        <div class="container">
        <!-- Page Content goes here -->
        <form>
            <legend class="align-center">Code Generator</legend>
            <table>
                <tr>
                    <td>Input mo number here</td>
                    <td><input type="text" placeholder="mo number" id="monum" name="monumber"></td>
                </tr>
                <tr>
                    <td><input class="waves-effect waves-light btn" type="submit" value="update" id="view"></td>
                    <td><input class="waves-effect waves-red btn" type="submit" value="edit"id="update"></td>
                </tr>
            </table>
            <h2><%=name%></h2>
            
        </form>
        </div>
        </body>
        
</html>
