<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/style.css" rel="stylesheet">
<title>SportsCenter</title>
</head>
<body>

	<!--==========================
  Header Section
============================-->
<header id="header">
    <div class="container">
    
      <div id="logo" class="pull-left">
        <a href="GotoHomeServlet"><img src="img/logo.png" alt="" title="" /></img></a>
        <!-- Uncomment below if you prefer to use a text image -->
        <!--<h1><a href="#hero">Header 1</a></h1>-->
      </div>
        
      <nav id="nav-menu-container">
        <ul class="nav-menu">
          <li><a href="GotoHomeServlet">Home</a></li>
          <li><a href="GotoAddRemoveSportServlet">Add/Remove Sport</a></li>
          <li><a href="http://localhost:9090/sports-center-aayl-project/">Goto RESTful API</a></li>
          <li><a href="LogoutServlet">Logout</a></li>   
        </ul>
      </nav><!-- #nav-menu-container -->
    </div>
</header>
  
</body>
</html>