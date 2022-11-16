<%@page import="javax.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	 
%>    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CodeGenerator</title>
        
    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
         <!-- Jquery -->   
         
        <!-- Jquery cdn -->
<script src="https://code.jquery.com/jquery-3.6.1.js"
	integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
	crossorigin="anonymous"></script>
    </head>
    <body>
        
        <div class="container">
        <!-- Page Content goes here -->
        <form action="CodeServer" method="post" id="myform">
            <legend class="align-center">Code Generator</legend>
            <table>
                <tr>
                    <td>Input mo number here</td>
                    <td><input type="text" placeholder="mo number" id="monum" name="monumber"></td>
                </tr>
                <tr>
                    <td><button id="smt" class="waves-effect waves-light btn" type="submit">update</button>
                    
           			</td>
                </tr>
            </table>
            <textarea class="materialize-textarea" id="txtarea1" rows="10" cols="10"><%=request.getAttribute("sqlcode")%></textarea>
        </form>
        </div>
      <!--  <script>
      $(document).ready(function(){
  		$("#txtarea1").hide();
          $("#smt").click(function(){
        	  $("#txtarea1").show();
          })
      })
      </script>-->
</body>

        
</html>
