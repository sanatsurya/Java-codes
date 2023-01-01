<%-- 
    Document   : login
    Created on : 14-Nov-2022, 8:10:19 pm
    Author     : ASUS
--%>

<%@page import="com.study.entity.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="errorpage.jsp" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        <link href="CSS/myStyles.css" rel="stylesheet" type="text/css"/>
        <!--jQuery-->
        <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
    </head>
    <body>
        <%@include file="Master.jsp" %>
        <main class="d-flex align-items-center primary-backgrounds banner-background " style="padding-bottom: 60px" >
            <div class="container " id="login_container">
                <div class="row">
                    <div class="col-md-4 offset-md-4">
                        <div class="card">
                            <div class="card-header text-center">
                                <span class="fa fa-user fa-3x text-dark"></span>

                            </div>
                            <%
                                Message m = (Message) session.getAttribute("msg");
                                if (m != null) {
                            %>
                            <div class="alert <%=m.getCss()%>" role="alert">
                                <%= m.getContents()%>
                            </div>
                            <%
                                    session.removeAttribute("msg");
                                }
                            %>

                            <div class="card-body" id="login">
                                <form id="loginFormData" action="LoginServlet" method="POST">
                                    <div class="mb-3">
                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                        <input type="email" class="form-control" id="uemailL" name="uemailL" aria-describedby="emailHelp">
                                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label">Password</label>
                                        <input type="password" class="form-control" id="upasswordL" name="upasswordL">
                                    </div>

                                    <button type="submit" class="btn btn-success">Login</button>
                                    <input type="button" class="btn btn-primary" id="gRegister" value="Register Here">
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="container" id="register_container">
                <div class="row">
                    <div class="col-md-6 offset-md-3">
                        <div class="card">
                            <div class="card-header text-center">
                                <span class="fa fa-user-plus fa-3x text-dark"></span>

                            </div>
                            <div class="card-body" id="register">
                                <form id="registerFormData">
                                    <div class="mb-3">
                                        <label for="exampleInputText" class="form-label">Full Name</label>
                                        <input type="text" class="form-control" id="uname" name="uname" aria-describedby="nameHelp">
                                        <div id="nameHelp" class="form-text">Fill your correct Name .</div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                        <input type="email" class="form-control" id="uemail" name="uemail" aria-describedby="emailHelp">
                                        <div id="emailHelp" class="form-text">Input your correct username provided at time of login</div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="genr" class="form-label">Gender</label><br>
                                        <input type="radio" id="gender" value="male" name="gender">Male
                                        <input type="radio" id="gender" value="female" name="gender">Female
                                        <input type="radio" id="gender" value="not desc" name="gender">Not to Describe
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label" aria-describedby="paHelp">Password</label>
                                        <input type="password" class="form-control" id="upass" name="upass">
                                        <div id="paHelp" class="form-text">Your password contains of a-z,0-9,@#$%*! </div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label">Re-Type Password</label>
                                        <input type="password" class="form-control" id="rupass" name="rupass">
                                    </div>
                                    <div class="mb-3">
                                        <div class="input-group mb-3">
                                            <input type="file" class="form-control" id="uimage"  name="uimage">
                                            <label class="input-group-text" for="inputGroupFile02" >Upload Image</label>
                                        </div>

                                    </div>
                                    <div class="mb-3 form-check">
                                        <input type="checkbox" class="form-check-input" id="ucheck" name="ucheck" value="check">
                                        <label class="form-check-label" for="exampleCheck1">I agree Term and Conditions</label>
                                    </div>
                                    <button type="submit" class="btn btn-success"  >Register</button>
                                    <input type="button" class="btn btn-primary " id="gLogin" value="Already Register">
                                    <button type="reset" id="resetR" class="btn btn-outline-danger">Reset</button>
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
        <!--sweet alert-->
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script>
            $(document).ready(function () {
                $("#register_container").hide();
                $("#login_container").show();
                $("#gRegister").click(function () {
                    $("#register_container").show();
                    $("#login_container").hide();
                });
                $("#gLogin").click(function () {
                    $("#register_container").hide();
                    $("#login_container").show();
                });
//                $("#resetR").click(){
//                    $("#registerFormData").trigger("reset");
//                }

                $("#registerFormData").on('submit', function (event) {
                    event.preventDefault();
                    let regF = new FormData(this);
                    $.ajax({
                        url: 'RegisterServlet',
                        data: regF,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {
                            if (data.trim() === 'done') {
                                swal({
                                    title: "Congratulation",
                                    text: "You are sucessfully registered!",
                                    icon: "success",
                                    button: "Go to logi!",
                                }).then((value) => {
                                    $("#register_container").hide();
                                    $("#login_container").show();
                                });
                            } else {
                                swal(data);
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            swal({
                                title: "Error ",
                                text: "Try fill the form again!",
                                icon: "error",
                                button: "ok Try again",
                            });
                        },
                        processData: false,
                        contentType: false
                    });
                });
//                LOGIN
                $(".loginFormData").on('submit', function (event) {
                    event.preventDefault();
                    let logF = new FormData(this);
                    $.ajax({
                        url: 'LoginServlet',
                        data: logF,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {
                            if (data.trim() === 'done') {
                                swal({
                                    title: "Welcome",
                                    text: "To edu-Dream",
                                    icon: "success",
                                    button: "Go to logi!"
                                });
                            } else {
                                console.log(data);
                            }
                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            console.log("error");
                        },
                        processData: false,
                        contentType: false
                    });
                });


//                $("#register").onclick(function(){
//                    $("#login_container").hide();
//                    $("#gRegister").show();
//                });
            });

        </script>
        <script>

        </script>
    </body>
</html>
