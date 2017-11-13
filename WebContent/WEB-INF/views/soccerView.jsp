<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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

<title>Soccer</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>


	<h1 style="color: black; margin-top: 20px;">Soccer Menu:</h1>
	<div class="container">
		<div class="row">
			<div class="col-sm-2">
				<p>
					<a href="SoccerDailySchedule" class="btn btn-primary btn-md">
						<span>Todays Schedule</span>
					</a>
				</p>
			</div>

<!-- 			<form action="SoccerMatchSummary" method=post class="form-inline"> -->
<!-- 				<div class="col-sm-3"> -->
<!-- 					<input type="text" name="matchId" required -->
<!-- 						placeholder="Enter match ID.." style="color: black;"> -->
<!-- 				</div> -->

				<div class="col-sm-2">
					<button type=submit class="btn btn-primary btn-md">
						<span>Match Summary</span>
					</button>
				</div>
			
			
<!-- 			<form action="SoccerMatchProbablity" method=post class="form-inline"> -->
<!-- 				<div class="col-sm-3"> -->
<!-- 					<input type="text" name="matchId" required -->
<!-- 						placeholder="Enter match ID.." style="color: black;"> -->
<!-- 				</div> -->

<!-- 				<div class="col-sm-2"> -->
<!-- 					<button type=submit class="btn btn-primary btn-md"> -->
<!-- 						<span>Match Probablity</span> -->
<!-- 					</button> -->
<!-- 				</div> -->
<!-- 			</form> -->

			

		
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
		
		</div><!--  row -->
		
<!-- 		<div class="col-sm-3"> -->
<!-- 			<form action="SoccerTeamProfile" method=post> -->
<!-- 				<input type="text" name="teamID" required -->
<!-- 					placeholder="Enter Team ID.." style="color: black;"> -->
<!-- 		</div> -->

<!-- 		<div class="col-sm-2"> -->
<!-- 			<button type=submit class="btn btn-primary btn-md"> -->
<!-- 				<span>Show Team Profile</span> -->
<!-- 			</button> -->
<!-- 			</form> -->

<!-- 		</div> -->

		
		<div>
			<textarea rows="20"
				style="color: black; font-size: 15px; border: none;" readonly>
			${output}
			</textarea>
		</div>
	</div>
	

		<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>