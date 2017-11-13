<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Place your favicon.ico and apple-touch-icon.png in the template root directory -->
<link href="favicon.ico" rel="shortcut icon">

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800"
	rel="stylesheet">

<!-- Bootstrap CSS File -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="lib/animate-css/animate.min.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="css/style.css" rel="stylesheet">

<link rel="stylesheet" href="css/style1.css">

<link
	href='http://fonts.googleapis.com/css?family=Titillium+Web:400,300,600'
	rel='stylesheet' type='text/css'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">

</head>


<title>Home</title>
</head>
<body>
	<script src="js/custom.js"></script>
	<jsp:include page="_header.jsp"></jsp:include>

	<div class="container">
		<h1 style="color: black; margin-top: 20px;">Welcome
			${userIs.name}!</h1>
		<br /> <br />
		<h3>Your selected spots are-</h3>
		<br> <br /> <br />
		<div class="row">
			<c:if test="${isCricket == 1}">
				<div class="col-sm-2">
					<p>
						<a href="GotoCricketServlet" class="btn btn-info btn-lg"> <span> <img
								src="img/man-playing-cricket.png" /></span> CRICKET
						</a>
					</p>
				</div>
			</c:if>


			<c:if test="${isSoccer== 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">
					<p>
						<a href="GotoSoccerServlet" class="btn btn-info btn-lg"> <span> <img
								src="img/man-playing-football.png" /></span> SOCCER
						</a>
					</p>
				</div>
			</c:if>


			<c:if test="${isTennis== 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">
					<p>
						<a href="GotoTennisServlet" class="btn btn-info btn-lg"> <span> <img
								src="img/man-playing-tennis.png" /></span> TENNIS
						</a>
					</p>	
				</div>

			</c:if>

		</div>
	</div>

	<br><br><br><br><br><br><br><br><br><br>
	
	<jsp:include page="_footer.jsp"></jsp:include>

</body>
</html>