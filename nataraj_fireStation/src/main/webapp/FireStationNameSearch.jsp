<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
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
				alt="" height="48" width="80"> </a><ul>
				<li style="display: inline-block;padding: 20px;">
					<a href="index.jsp" class="col-lg-2 col-sm-2">Home Page</a>
					<li style="display: inline-block;">
					<a href="fire" class="col-lg-2 col-sm-2">FireStation Register</a>
				</ul>
			</div>
	</nav>
	<h1>Welcome to FireStationName Search page</h1>
	<h3><span style="color:red">${message}</span></h3>
	<form action="searchByStationName" method="get">
	Search By StationName<input type="text" name="stationName"/>
	<input type="submit" value="search"/>
		</form>
	
	<div>
	<table class="table table-bordered">
	<tr>
	<th>ID</th>
	<th>StationName</th>
	<th>Location</th>
	<th>FireStationNo</th>
	<th>NoOfVehicles</th>
	<th>Edit</th>
	<th>Delete</th>
	</tr>
	<c:forEach items="${dto}" var="t">
	<tr>
	<td>${t.id}</td>
	<td>${t.stationName}</td>
	<td>${t.location}</td>
	<td>${t.fireStationNo}</td>
	<td>${t.noOfVehicles}</td>
	<td><a href="update?id=${t.id}">Edit</a></td>
	<td><a href="delete?id=${t.id}" class="btn btn-danger"}>Delete</a></td>
	</tr>
	</c:forEach>
		</table>	
	</div>
</body>
</html>