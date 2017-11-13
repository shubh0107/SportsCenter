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

<title>Tennis</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	
	<div class="container">
	<h1 style="color: black; margin-top: 20px;">Tennis Menu:</h1>
		<div class="row">
			<div class="col-sm-2">
				<p>
					<a href="TennisPlayerRankings" class="btn btn-primary btn-md">
						<span>Show Player Rankings</span>
					</a>
				</p>
			</div>
		
				
			<div class="col-sm-2">
				<p>
					<a href="TennisDoublesRankings" class="btn btn-primary btn-md">
						<span>Show Doubles Rankings</span>
					</a>
				</p>
			</div>
			
			
			
			</div><!--  row -->
			
			<div>			
			<c:if test="${toutput == 1}">
				<c:import url="/tennisRankings.xsl" var="xslt" />
				<c:import url="/tennisRankingsXml.xml" var="xmltext" />
	
				<x:transform xml="${xmltext}" xslt="${xslt}" />
			</c:if>
			</div>
			
			<div>			
			<c:if test="${toutput == 2}">
				<c:import url="/tennisDoublesRanking.xsl" var="xslt" />
				<c:import url="/tennisDoublesRankingXml.xml" var="xmltext" />
	
				<x:transform xml="${xmltext}" xslt="${xslt}" />
			</c:if>
			</div>
			
		
				<br><br><br><br><br><br><br><br><br><br>
				<br><br><br><br><br><br><br><br>
				<br><br><br><br><br><br><br><br>
			</div>
				
				
<!-- 
				
			<div class="col-md-5">
				
				<form action="SoccerTournamentInfo" method="post" class="form-inline">

					<select name="tournamentId">
						<option value="sr:tournament:7">UEFA Champions League</option>
						<option value="sr:tournament:17">Premier League</option>
						<option value="sr:tournament:35">Bundesliga</option>
						<option value="sr:tournament:465">UEFA Super Cup</option>
						<option value="sr:tournament:679">UEFA Europa League</option>
					</select>

					<button type=submit class="btn btn-primary btn-md">
						<span> Show Tournament Info</span>
					</button>
				</form>		
			</div>
		
 -->		
		
		
		
		<br>
<!-- 		<div> -->
<!-- 			<textarea rows="40" -->
<!-- 				style="color: black; font-size: 15px; border: none;" readonly> -->
<%-- 			${output} --%>
<!-- 			</textarea> -->
<!-- 		</div> -->
<!-- 	</div> -->
	
	
	
	
	
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>