<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="./css/style.css" rel="stylesheet" type="text/css">

<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,700,700i|Raleway:300,400,500,700,800"
	rel="stylesheet">

<!-- Libraries CSS Files -->
<link href="lib/font-awesome/css/font-awesome.min.css" rel="stylesheet">
<link href="lib/animate-css/animate.min.css" rel="stylesheet">


<!-- Bootstrap CSS File -->
<link href="lib/bootstrap/css/bootstrap.min.css" rel="stylesheet">

<!-- Main Stylesheet File -->
<link href="css/style.css" rel="stylesheet">
<link rel="stylesheet" href="css/style1.css">

<title>Cricket</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<h1 style="color: black; margin-top: 20px;">Cricket Menu:</h1>
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
			<form class="form-inline" action="CricketDailySchedule" method="post">
				<select name="date"> 		
					<option value="DD" disabled selected>DD</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>
					<option value="13">13</option>
					<option value="14">14</option>
					<option value="15">15</option>
					<option value="16">16</option>
					<option value="17">17</option>
					<option value="18">18</option>
					<option value="19">19</option>
					<option value="20">20</option>
					<option value="21">21</option>
					<option value="22">22</option>
					<option value="22">23</option>
					<option value="23">24</option>
					<option value="24">25</option>
					<option value="25">26</option>
					<option value="26">27</option>
					<option value="27">28</option>
					<option value="28">29</option>
					<option value="29">30</option>
					<option value="30">30</option>
					<option value="31">31</option>					
				</select>
				<select name="month">
					<option value="MM" disabled selected>MM</option>
					<option value="01">01</option>
					<option value="02">02</option>
					<option value="03">03</option>
					<option value="04">04</option>
					<option value="05">05</option>
					<option value="06">06</option>
					<option value="07">07</option>
					<option value="08">08</option>
					<option value="09">09</option>
					<option value="10">10</option>
					<option value="11">11</option>
					<option value="12">12</option>				
				</select>
				
				<select name="year">
					<option value="2017" disabled selected>YYYY</option>
					<option value="2017">2017</option>
					<option value="2016">2016</option>
					<option value="2015">2015</option>
				</select>
					 <button type="submit" class="btn btn-primary">Show Schedule</button>
					</form>
				</div>
				
				

<!-- 			<form action="CricketMatchSummary" method=post class="form-inline"> -->
<!-- 				<div class="col-sm-3"> -->
<!-- 					<input type="text" name="matchId" required -->
<!-- 						placeholder="Enter match ID.." style="color: black;"> -->
<!-- 				</div> -->

<!-- 				<div class="col-sm-2"> -->
<!-- 					<a href="CricketMatchSummary" class="btn btn-primary btn-md"> -->
<!-- 						<span>Match Summary</span> -->
<!-- 					</button> -->
<!-- 				</div> -->
<!-- 			</form> -->


			<div class="col-md-3">
				<form action="CricketTeamProfile" method="post" class="form-inline">

					<select name="cricketTeamId">
						<option value="a867f0b5-b80e-471d-9cf9-782fb1880801">India</option>
						<option value="eb97c287-9531-4637-93aa-98bb4cfef880">Australia</option>
						<option value="909e7bcb-5ea0-4919-b756-66f0773c7f00">West Indies</option>
						<option value="a0a815ad-108b-402c-b930-8c888f07dc01">Bangladesh</option>
						<option value="c2fe2271-3b67-4c7b-b29c-f3c2c67ebf53">England</option>
						<option value="55d045c2-28ad-4855-90ac-059f844adb8a">Zimbabwe</option>
						<option value="530f5808-0b2a-48a5-917e-fc99efc8a7ed">South Africa</option>
						<option value="c6504611-8333-45ad-84e3-1d8abafeae8c">SriLanka</option>
						<option value="a21f5ee4-1149-4e75-bda4-3c0e271938f4">New Zealand</option>

					</select>

					<button type=submit class="btn btn-primary btn-md">
						<span> Show Team Profile</span>
					</button>
				</form>
			</div>
		
		<!--  row -->
		
		</div>
		<br> <br>

		<p style="color:red;">${error}</p>
		<div>			
			<c:if test="${output == 1}">
				<h3>Schedule for ${showDate}/${showMonth}/${showYear}</h3>
				<c:import url="/cricketSchedule.xsl" var="xslt" />
				<c:import url="/cricketScheduleXml.xml" var="xmltext" />
	
				<x:transform xml="${xmltext}" xslt="${xslt}" />
			</c:if>
			
			<c:if test="${output == 2}">
				<c:import url="/cricketMatchSummary.xsl" var="xslt" />
				<c:import url="/cricketMatchSummaryXml.xml" var="xmltext" />
	
				<x:transform xml="${xmltext}" xslt="${xslt}" />

			</c:if>
			
			<c:if test="${output == 3}">
				<c:import url="/cricketTeamProfile.xsl" var="xslt" />
				<c:import url="/cricketTeamProfileXml.xml" var="xmltext" />
	
				<x:transform xml="${xmltext}" xslt="${xslt}" />

			</c:if>
		</div>
	</div>

	<br/><br/><br/><br/><br/><br/><br/><br/><br/><br/><br/>
	<br/><br/><br/><br/><br/><br/><br/><br/><br/>

	<jsp:include page="_footer.jsp"></jsp:include>



</body>

</html>