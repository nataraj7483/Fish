<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>X-Workz</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>

</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<div class="container-fluid">
			<a class="navbar-brand" href="#"
				class="d-inline-block align-text-top"><img
				src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
				alt="" height="48" width="80"> </a> <a href="index.jsp">Home Page</a>
		</div>
	</nav>
	<h1>Welcome to Fire Station data page</h1>

	<c:forEach items="${errors}" var="e">
		<br>
		<span style="color: red;">${e.message}</span>
	</c:forEach>

	<form action="fire" method="post"> 
		<div class="mb-3" >
			<label for="formFile" class="form-label">StationName</label> <input
				type="text" class="form-control" name="stationName" id="formFile" required="required"
				placeholder="Enter StationName" value="${stationName}" />
		</div>
		<div class="mb-3">
			<label for="formFile" class="form-label">Location</label> 
			<input	type="text" class="form-control" name="location" id="formFile" required="required"
				placeholder="Enter location" value="${location}" />
		</div>
		    FireStationNo <select class="form-select"
			aria-label="Default select example" name="fireStationNo" required="required">
			<option selected value="">Select Number</option>
			<c:forEach items="${fireStationNo}" var="f">
			<option value="${f}">${f}</option>
			</c:forEach>
			</select>
	
	        NoOfVehicles <select class="form-select"
			aria-label="Default select example" name="noOfVehicles" required="required">
			<option selected value="">Select NoOfVehicles</option>
			<c:forEach items="${noOfVehicles}" var="n">
			<option value="${n}">${n}</option>
			</c:forEach>
			</select>
		
		<input type="submit" value="Save" class="btn btn-primary"/>
		</form>
</body>
</html>