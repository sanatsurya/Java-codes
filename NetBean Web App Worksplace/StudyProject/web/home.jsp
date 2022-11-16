<%@page import="com.study.helper.ConnectionProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
            .banner-background{
        clip-path: polygon(20% 0%, 80% 0%, 100% 0, 100% 95%, 63% 100%, 26% 95%, 0 100%, 0 1%);
    }
        </style>
    </head>
    <body>
        <!--nav bar-->
        <%@include file="Master.jsp" %>
        <!--banner-->
        <div class="container-fluid">
            <div class="mt-4 p-5 alert primary-backgrounds rounded banner-background">
                <h2 class="display-3">Admission made easy with Education Dreams. </h2>
                <p class="display-5">we are here to help you to choose your best educational institution</p>
                <button class="btn btn-outline-dark btn-lg">Connect With us to Join<span class="material-symbols-outlined">
                        handshake
                    </span></button>
            </div>
        </div>
        <!--//cards-->
        <div class="container">
            <div class="row mb-2">
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
            </div>
            
            <div class="row mb-2">
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
                <div class="col-md-4">
                    <div class="card" style="width: 18rem;">
                        <!--<img src="..." class="card-img-top" alt="...">-->
                        <div class="card-body">
                            <h5 class="card-title">Card title</h5>
                            <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <%--<%@include file="footer.jsp" %>--%>
    </body>
    
</html>
