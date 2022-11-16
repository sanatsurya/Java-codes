<%-- 
    Document   : index
    Created on : 21-Oct-2022, 9:01:27 pm
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@page errorPage="404error.jsp" %>--%>
<%int result=0;%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <title>Calculator</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-md-6 offset-md-3">
                    <form action="operation.jsp" >
                    <div class="card">
                        <div class="card-header bg-dark text-white">
                            <h2 class="text-center">calculator</h2>
                        </div>
                        
                        <div class="card-body">
                            <div class="form-group">
                                <input type="text" class="form-control" value="0" name="num1" placeholder="first number here"/>
                            </div>
                            <div class="form-group">
                                <input type="text" class="form-control" value="0" name="num2" placeholder="first second here"/>
                            </div>
                            
                        </div>
                        <div class="card-footer text-center bg-dark text-white">
                            <button type="submit" class="btn btn-outline-light">Divide</button>
                        </div>
                    </div>
                    </form>
                </div>
                
            </div>
        </div>
       
    </body>
</html>
