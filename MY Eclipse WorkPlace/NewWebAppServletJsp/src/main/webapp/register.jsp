<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<link rel="stylesheet" type="text/css" href="./stylesheets/register.css">
</head>
<body>
	<div class="container">
		<form action="register" method="post" class="registerform">
			<table>
				<tr>
					<td>User Name</td>
					<td><input type="text" name="uname" placeholder="Enter Your Name"></td>
				</tr>
				<tr>
					<td>Email Id</td>
					<td><input type="email" name="uemail" placeholder="Enter Your Email"></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="upassword" placeholder="Enter valid password"></td>
				</tr>
				<tr>
					<td>Gender</td>
					<td><input type="radio" name="ugender" value="male">Male &nbsp; &nbsp; <input type="radio" name="ugender" value="female">Female</td>
				</tr>
				<tr>
					<td>User Type</td>
					<td><select name="usertype">
							<option value="not selected" >Select</option>
							<option value="Principal">Principal</option>
							<option value="Teacher">Teacher</option>
							<option value="Students">Students</option>
						</select>
					</td>
				</tr>
				<tr>
					<td><input type="checkbox" name="condition" value="checked "></td>
					<td>Agreed terms and condition</td>
				</tr>
				<tr>
					<td><button type="submit" class="submitbtn">Register</button></td>
					<td><button type="reset" class="resetbtn">Reset</button></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>