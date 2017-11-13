<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
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

<title>Add/Remove Sport</title>
</head>
<body>
	<script src="js/custom.js"></script>
	<jsp:include page="_header.jsp"></jsp:include>

	<div class="container">
		<h1 style="color: black; margin-top: 20px;">Add/Remove Sport</h1>
		<br />
		<h3>${userIs.name}, your sports are-</h3>
		<br> 
		<h4>Click any sport to remove it..</h4>
		<div class="row">

			<c:if test="${sessionScope.isCricket == 1}">
				<div class="col-sm-2">
					<p>
						<a href="RemoveSportCricket" class="btn btn-info btn-md"> <span>
								<img src="img/man-playing-cricket.png" />
						</span>REMOVE CRICKET
						</a>
					</p>

				</div>
			</c:if>


			<c:if test="${sessionScope.isSoccer== 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">

					<p>
						<a href="RemoveSportSoccer" class="btn btn-info btn-md"> <span> <img
								src="img/man-playing-football.png" /></span>REMOVE SOCCER
						</a>
					</p>



				</div>
			</c:if>

			<c:if test="${sessionScope.isTennis== 1}">
				<div class="col-sm-2"></div>

				<div class="col-sm-2">

					<p>
						<a href="RemoveSportTennis" class="btn btn-info btn-md"> <span> <img
								src="img/man-playing-tennis.png" /></span>REMOVE TENNIS
						</a>
					</p>
				</div>
			</c:if>
			
			
			<c:if test="${sessionScope.isCricket== 0 && sessionScope.isSoccer == 0 && sessionScope.isTennis == 0}">
				<h3 style="color: red;">Please add atleast one sport</h3>
			</c:if>
		</div>
		
		<div class="row">
			<h3>You can add-</h3>
			<br>

			<c:if test="${sessionScope.noCricket == 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">
					<p>
						<a href="AddSportCricket" class="btn btn-danger btn-md"> <span> <img
								src="img/man-playing-cricket.png" /></span>ADD CRICKET
						</a>
					</p>
				</div>
			</c:if>

			<c:if test="${sessionScope.noSoccer == 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">
					<p>
						<a href="AddSportSoccer" class="btn btn-danger btn-md"> <span> <img
								src="img/man-playing-tennis.png" /></span>ADD SOCCER
						</a>
					</p>
				</div>
			</c:if>
		

			<c:if test="${sessionScope.noTennis== 1}">
				<div class="col-sm-2"></div>
				<div class="col-sm-2">
					<p>
						<a href="AddSportTennis" class="btn btn-danger btn-md"> <span> <img
								src="img/man-playing-tennis.png" /></span>ADD TENNIS
						</a>
					</p>
				</div>
			</c:if>
			
			<c:if test="${sessionScope.noCricket== 0 && sessionScope.noSoccer == 0 && sessionScope.noTennis == 0}">
				<p>You have selected all sports. We are adding more sports soon. Thank you!</p>
			</c:if>
			
			
		</div>

		






	</div>

	<jsp:include page="_footer.jsp"></jsp:include>




</body>
</html>