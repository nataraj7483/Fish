<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<div>
		<nav class="navbar navbar-green bg-dark">
			<div class="container-fluid">
				<img
					src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
					class="img-fluid" hight="80px" width="80px">

				<form class="d-flex">
					<input class="form-control me-3" type="search" placeholder="Search"
						aria-label="Search">

				</form>
			</div>
		</nav>
	</div>
	
	<form action="bakery" method="post">
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   BakeryName</label>
	   <input type="text" class="form-control" 
	   id="formGroupExampleInput" placeholder="Enter Bakery Owner"
	   name="name" />
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   OwnerName</label>
	   <input type="text" class="form-control" 
	   id="formGroupExampleInput" placeholder="Owner name"
	   name="owner" />
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   Wife</label>
	   <input type="text" class="form-control" 
	   id="formGroupExampleInput" placeholder="wife"
	   name="wife" />
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   Married</label>
	   <input type="radio" name="married" value="true" />
	   Yes<input type="radio" name="married" value="false" />NO
	   
	   	</div>
	   	<div>
	   	   <textarea class="form-control" placeholder="famous for"
	   	   id="floatingTextarea" name="famous"></textarea>
	   	   <label for="floatingTextarea">famous for</label>
	   	</div>
	   	
	   	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   Since</label>
	   <input type="text" class="form-control" 
	   id="formGroupExampleInput" placeholder="Since From"
	   name="since" />
	</div>
	
	<input type="submit" value="Save">
	
	</form>


</body>
</html>