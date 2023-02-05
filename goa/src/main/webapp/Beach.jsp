<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>X-workz</title>
</head>

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
	<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search"> <a class="btn btn-outline-primary"
						href="index.jsp">Home</a>

				</form>
			</div>
		</nav>
	</div>


	<form action="beach" method="post">

		<div>
			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
				BeachName </label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Beach Name"
					name="name">
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
				Location</label> <input type="text" class="form-control"
					id="exampleFormControlInput1" placeholder="Enter Location"
					name="location">
			</div>

			<div class="mb-3">
				<label for="exampleFormControlInput1" class="form-label">
				Clean:Yes </label> <input type="radio" name="clean" value="true" /> 
				No <input type="radio" name="clean" value="flse" />
			</div>


			<div>

				<select class="form-select" aria-label="Default select example"
					name="game">
					<option selected>Select Game Name</option>
					<option value="Fishing">Fishing</option>
					<option value="Boating">Boating</option>
					<option value="BoatRacing">Boat Racing</option>
					<option value="Jet Skilling">Jet Skilling</option>
					<option value="Rowing">Rowing</option>

				</select>
			</div>
			<div>
				<input type="submit" class="btn btn-dark" value="submit"
					name="submit" />

			</div>

		</div>
	</form>


</body>
</html>