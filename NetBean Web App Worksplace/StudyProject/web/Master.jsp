<%@page import="com.study.entity.UserTable"%>
<%
    UserTable user = (UserTable) session.getAttribute("currentuser");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="CSS/myStyles.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
        <script src='https://kit.fontawesome.com/a076d05399.js' crossorigin='anonymous'></script>
        <script src="JS/myJavaScripts.js" type="text/javascript"></script>
    </head>
    <body>
        <!--nav bar start-->
        <nav class="navbar navbar-expand-lg navbar-light primary-backgrounds">
            <div class="container-fluid">
                <a class="navbar-brand" href="#"> <span class="fas fa-school"></span> Edu Dream</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="home.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="#">Admission</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Education Type
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Schools</a></li>
                                <li><a class="dropdown-item" href="#">Inter mediate</a></li>
                                <li><a class="dropdown-item" href="#">Graduation Colleges</a></li>
                                <li><a class="dropdown-item" href="#">Engineering Colleges</a></li>
                                <li><a class="dropdown-item" href="#">Medical Colleges</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">Contact us</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="#">About</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-dark" type="submit">Search</button>

                    </form>
                    <div class="d-flex  px-1">
                        <% if (user == null) {%>
                        <a id="login" class="btn btn-outline-dark " href="login.jsp"><span class="fas fa-sign-in-alt"></span></a>
                            <%} else {%>
                        <a class="btn btn-outline-white" data-bs-toggle="modal" data-bs-target="#exampleModal"><span class="fa fa-user-circle"></span><%= user.getUname()%></a>
                        <!--modal-->
                        <!-- Button trigger modal -->
                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header primary-backgrounds text-white">
                                        <div class="container text-center">
                                            <img src="img/ProfilePicture/<%= user.getProfilePicture()%>" alt="profile picture" style="height: 50px;width: 56px;border-radius:26px"/>
                                            <h5 class="modal-title" id="exampleModalLabel"><%= user.getUname()%></h5>
                                        </div>
                                    </div>
                                    <div class="modal-body" >
                                        <div id="modal_profile_feture">
                                            <a class="btn" id="p_update"> Edit and Update<span class="fa fa-edit"></span></a><br>
                                            <a class="btn" id="p_detail"> Professional Details <span class="fas fa-chalkboard-teacher"></span></a><br>
                                            <a class="btn" id="p_payment"> Payment and Bills <span class="fas fa-money-check-alt"></span></a>
                                        </div>
                                        <div id="profile_view" class="hide">
                                            <form>
                                                <div class="mb-3">
                                                    <label  class="form-label">Name</label>
                                                    <label  class="form-label">:  <%= user.getUname()%></label>
                                                </div>
                                                <div class="mb-3">
                                                    <label  class="form-label">Email</label>
                                                    <label  class="form-label">:  <%= user.getUemail()%></label>
                                                </div>
                                                <div class="mb-3">
                                                    <label  class="form-label">Gender</label>
                                                    <label  class="form-label">:  <%= user.getUgender()%></label>
                                                </div>
                                                <% if (user.getAbout() == null) {%>
                                                <%} else {%>
                                                <div class="mb-3">
                                                    <label  class="form-label">About</label>
                                                    <label  class="form-label">:  <%= user.getAbout()%></label>
                                                </div>
                                                <%}%>
                                                <button type="button" id="back_modal" class="btn btn-outline-dark" >Back</button>
                                            </form>
                                        </div>
                                        <div id="profile_edit">
                                            <h4 class="mt-3">Please Edit Carefully your details</h4>
                                            <form id="editform" >
                                                <table>
                                                    <tr style="display: none;">
                                                        <td> ID :</td>
                                                        <td><input type="text" name="eid" value="<%= user.getId()%>" >  </td>
                                                    </tr>
                                                    <tr>
                                                        <td> Name :</td>
                                                        <td> <input type="text" name="e_uname" class="form-control" value="<%= user.getUname()%>"> </td>
                                                    </tr>
                                                    <tr>
                                                        <td> Email :</td>
                                                        <td> <input type="text" name="e_uemail" class="form-control" value="<%= user.getUemail()%>"> </td>
                                                    </tr>
                                                    <tr>
                                                        <td> Gender :</td>
                                                        <td> <input type="text" name="e_gender" class="form-control" value="<%= user.getUgender()%>" readonly> </td>
                                                    </tr>
                                                    <tr>
                                                        <td> About :</td>
                                                        <td>
                                                            <textarea  name="e_about" rows="5">
                                                                <%= user.getAbout()%> 
                                                            </textarea>
                                                        </td>
                                                    </tr>
                                                    <tr style="display: none;">
                                                        <td> Image : </td>
                                                        <td> <input type="text" name="e_image" class="form-control" value="<%= user.getProfilePicture()%>"> </td>
                                                    </tr>
                                                </table>
                                                <button type="submit" class="btn btn-success">Update</button>
                                            </form>
                                                    <br><br>
                                                    <button type="button" id="back_modal" class="btn btn-outline-dark" >Back</button>
                                        </div>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
                                        <a  href="LogOutServlet" class="btn btn-outline-danger"><span class="fas fa-sign-out-alt">
                                            </span></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <!--modal end-->
                        <!--                        <a class="btn btn-outline-danger" href="LogOutServlet"><span class="fas fa-sign-out-alt">
                                                    </span></a>-->
                        <%}%>
                    </div>

                </div>
            </div>
        </nav>
        <!--nav bar end-->

        <!--scripts-->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
        <!--jQuery-->
        <script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
        <!--java script end-->
        <!--font awsome-->

        <!--myjava script-->
        <!--sweet alert-->
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <script>
            function backmodal(){
                $("#back_modal").click(function () {
                    $("#profile_view").hide();
                    $("#profile_edit").hide();
                    $("#p_update").show();
                    $("#p_detail").show();
                    $("#p_payment").show();
                });
            }
            $(document).ready(function () {
                $("#profile_view").hide();
                $("#profile_edit").hide();
                $("#p_detail").click(function () {
                    $("#profile_view").show();
                    $("#p_update").hide();
                    $("#p_detail").hide();
                    $("#p_payment").hide();
                });
                $("#p_update").click(function () {
                    $("#profile_edit").show();
                    $("#p_update").hide();
                    $("#p_detail").hide();
                    $("#p_payment").hide();
                });
                backmodal();
            });
            $("#editform").on('submit', function (event) {
                backmodal();
                console.log("sanat");
                event.preventDefault();
                let regF = new FormData(this);
                console.log(regF);
                $.ajax({
                    url: 'EditServlet',
                    data: regF,
                    type: 'POST',
                    success: function (data, textStatus, jqXHR) {
                        if (data.trim() === 'done') {
                            swal({
                                title: "Congratulation",
                                text: "Update sucessfully!",
                                icon: "success",
                                button: "Go to logi!",
                            }).then((value) => {
                                $("#profile_view").hide();
                                $("#profile_edit").hide();
                                $("#p_update").show();
                                $("#p_detail").show();
                                $("#p_payment").show();
                            });
                        } else {
//                            swal(data);
                            swal({
                                title: "Error ",
                                text: "Try fill the form again!",
                                icon: "error",
                                button: "ok Try again",
                            });

                        }
                    },
                    error: function (jqXHR, textStatus, errorThrown) {
                        swal({
                            title: "Error ",
                            text: "Try fill the form again!",
                            icon: "error",
                            button: "ok Try again"
                        });
                    },
                    processData: false,
                    contentType: false
                });
                
            });
        </script>
    </body>
</html>
