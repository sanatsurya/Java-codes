<%-- 
    Document   : login
    Created on : 14-Nov-2022, 8:10:19 pm
    Author     : ASUS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
                            <div class="card-body" id="login">
                                <form>
                                    <div class="mb-3">
                                        <label for="exampleInputEmail1" class="form-label">Email address</label>
                                        <input type="email" class="form-control" id="uemailL" aria-describedby="emailHelp">
                                        <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label">Password</label>
                                        <input type="password" class="form-control" id="upasswordL">
                                    </div>
                                    <div class="mb-3 form-check">
                                        <input type="checkbox" class="form-check-input" id="logincheck">
                                        <label class="form-check-label" for="exampleCheck1">Check me out</label>
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
                                <form id="registerFormData" action="RegisterServlet" method="post">
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
                                        <input type="radio" id="gender" name="gender">Male
                                        <input type="radio" id="gender" name="gender">Female
                                        <input type="radio" id="gender" name="gender">Not to Describe
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label" aria-describedby="paHelp">Password</label>
                                        <input type="password" class="form-control" id="upassword" name="upassword">
                                        <div id="paHelp" class="form-text">Your password contains of a-z,0-9,@#$%*! </div>
                                    </div>
                                    <div class="mb-3">
                                        <label for="exampleInputPassword1" class="form-label">Re-Type Password</label>
                                        <input type="password" class="form-control" id="reupassword" name="rupassword">
                                    </div>
                                    <div class="mb-3 form-check">
                                        <input type="checkbox" class="form-check-input" id="ucheck" name="ucheck" value="check">
                                        <label class="form-check-label" for="exampleCheck1">I agree Term and Conditions</label>
                                    </div>
                                    <button type="submit" class="btn btn-success"  >Register</button>
                                    <input type="button" class="btn btn-primary " id="gLogin" value="Already Register">
                                </form>

                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </main>
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
              
                $("#registerFormData").on('submit', function (event) {
                    //event.preventDefault();
                    let regF = new FormData(this);
                    $.ajax({
                        url: 'RegisterServlet',
                        data: regF,
                        type: 'POST',
                        success: function (data, textStatus, jqXHR) {

                        },
                        error: function (jqXHR, textStatus, errorThrown) {

                        },
                        processData: false,
                        contentType: false
                    });
                    console.log("Done");
                });

//                $("#register").onclick(function(){
//                    $("#login_container").hide();
//                    $("#gRegister").show();
//                });
            });

        </script>
    </body>
</html>
