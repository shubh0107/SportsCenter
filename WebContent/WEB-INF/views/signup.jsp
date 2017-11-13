<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sign Up</title>

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">


<link rel="stylesheet" href="css/signup_style.css">
<script type="text/javascript" src="js/signUp.js"></script>

</head>

<body>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Sign Up Form</title>
<link rel="stylesheet" href="css/normalize.css">
<link href='http://fonts.googleapis.com/css?family=Nunito:400,300'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet" href="css/main.css">
</head>
<body>



	<div class="container">
		<br> <br>
		<h1>Sign Up</h1>
		<div class="row">
			<form action="doSignUpServlet" method="post" name="signUpForm" onsubmit="validateForm()">
				<div class="col-md-5">
					<fieldset>
						<p style="color: red;">${errorString}</p>
						<legend>
							<span class="number">1</span>Your basic info
						</legend>

						<label for="name">Name:</label> 
						<input type="text" id="name" onblur="validateName()" name="user_name" required	value="${user.name}" maxlength="40">
						<div id="nameError" style="color: red;"></div>
						 
						<label for="mail">Email:</label> 
						<input	type="email" id="mail" onblur="validateEmail()"name="user_email" required value="${user.email}"> 
						<span id="emailError" style="color: red;"></span>
						
						
						<label for="password">Password:</label> 
						<input type="password" id="password" name="user_password" maxlength="6" minlength="6" > 
						
						<label for="password">Confirm Password:</label> 
						<input type="password" id="password" onblur="validatePassword()" name="confirm_password" maxlength="6" minlength="6" > 
						<span id="passError" style="color: red;"></span>
						
						<label>Gender:</label>
						<input type="radio" id="male" value="M" name="user_gender" required>
						<label for="user_gender" class="light"> Male </label> 
						<br> 
						<input type="radio" id="female" value="F" name="user_gender" required>
						<label for="user_gender" class="light"> Female </label> <br /> <br /> 
						
						<label value="${user.dob}" for="dob">Date of Birth:</label > 
						<input id="dob" type="date" name="dob" max="2017-04-19" min="1900-01-01">


					</fieldset>
				</div>
			


			<div class="col-md-2"></div>



			<div class="col-md-5">
				<fieldset>
					<legend>
						<span class="number">2</span>Your profile
					</legend>
					<label for="bio">Something about you:</label>
					<textarea rows="8" cols="45" id="bio" name="user_bio"></textarea>

					<br /> <br /> <label>Preferred Sports:</label> 
					<input type="checkbox" id="Cricket" value="1" name="cricket_selected"> <label class="light" for="cricket"> Cricket </label> <br>
					<input type="checkbox" id="Football" value="1" name="football_selected"> <label class="light" for="football"> Football </label> <br>
					<input type="checkbox" id="Tennis" value="1"	name="tennis_selected"> <label class="light" for="tennis"> Tennis </label>

				</fieldset>
			</div>
			<button type="submit">Sign Up</button>
		  </form>
		</div>
	</div>
	</body>
</body>

</html>