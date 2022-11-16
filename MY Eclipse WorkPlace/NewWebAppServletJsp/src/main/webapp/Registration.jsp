<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Compiled and minified CSS -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

<!-- Compiled and minified JavaScript -->
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
<!-- Jquery cdn -->
<script src="https://code.jquery.com/jquery-3.6.1.js"
	integrity="sha256-3zlB5s2uwoUzrXK3BT7AX3FyvojsraNFxCc2vC/7pNI="
	crossorigin="anonymous"></script>

<meta charset="UTF-8">
<title>REGISTRATION</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col m6 offset-m3">
				<div class="card">
					<div class="card-content">
						<h3 class="center-align">Register Here</h3>
						<h5 class="regIsSuc center-align">Success fully registered</h5>
						<h5 class="regNotSuc center-align">There is some error register unsuccess full</h5>
						<div class="form center-align">
							<form class="form" id="myform" >
								<input type="text" placeholder="Insert your name" name="uname">
								<input type="email" placeholder="Insert your email"
									name="uemail"> <input type="text"
									placeholder="Insert your phone" name="uphone"> <input
									type="password" placeholder="Insert your password"
									name="upassword">
								<div class="file-field input-field">
									<div class="btn">
										<span>File</span> <input type="file" name="image">
									</div>
									<div class="file-path-wrapper">
										<input class="file-path validate" type="text" placeholder="input image ">
									</div>
								</div>
								<button type="submit" class="btn light-green darken-4">Submit</button>
							</form>
						</div>
						<div class="loader center-align" style="margin-top: 20px;">
							<div class="preloader-wrapper small active">
								<div class="spinner-layer spinner-green-only">
									<div class="circle-clipper left">
										<div class="circle"></div>
									</div>
									<div class="gap-patch">
										<div class="circle"></div>
									</div>
									<div class="circle-clipper right">
										<div class="circle"></div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
	$(document).ready(function(){
		$(".regIsSuc").hide();
		$(".regNotSuc").hide();
		$(".loader").hide();
        $("#myform").on('submit',function(event){
			event.preventDefault();
            // var f = $(this).serialize();
            let f = new FormData(this);
            $(".loader").show();
            $(".form").hide();
            $(".regIsSuc").hide();
            $(".regNotSuc").hide();
            
            $.ajax({
                url:"Register",
                data:f,
                type:'POST',
                success: function(data,textStatus,jqXHR){
                	$(".loader").hide();
                    $(".form").show();
                    $(".regIsSuc").show();
                    console.log(data);
                    console.log("sucess");
                },
                error: function(jqXHR,textStatus,errorThrown){
                    console.log(data);
                    $(".loader").hide();
                    $(".form").show();
                    $(".regNotSuc").show();
                },
                processData: false,
                contentType: false,
               
            })
            console.log("done");

        })
    })
	</script>
</body>
</html>