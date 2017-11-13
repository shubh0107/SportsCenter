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
		<h1>Log In</h1>
			<div class="row">
			<form action="doLoginServlet" method="post">
				<div class="col-md-5">
				<p style="color: red;">${errorString}</p>
				<fieldset>
					<p>${loggedOut}</p>	 
						<label for="mail">Email:</label> 
						<input	type="email" id="mail" name="user_email" placeholder="Enter you email.." value="${userEmail}"> 
						
						<label for="password">Password:</label> 
						<input type="password" id="password" name="user_password" placeholder="Enter your password" maxlength="6"> 
						
<!-- 						<input type="checkbox" id="rememberMe" value=1 name="rememberMeSelected" > <label class="light" for="rememberMe"> Remember Me </label> <br> -->
					
				</fieldset>
			</div>
			<button type="submit">Login</button>
		  </form>
		</div>
	</div>
	</body>
</body>

</html>