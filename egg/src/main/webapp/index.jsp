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
	
	<form action="egg" method="post">
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   HotelName</label>
	   <input type="text" class="form-control" 
	   id="formGroupExampleInput" placeholder="hotelName"
	   name="hotelName" />
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   EggDishName</label>
	   
	   <select name="dishName">
	     <option>Select</option>
	     <option>Omlet</option>
	     <option>Egg Rice</option>
	     <option>Half Boild</option>
	     <option>Egg burgi</option>
	     <option>Egg Masala</option>
	     <option>Egg Biriyani</option>
	     <option>Full Boiled</option>
	     
	   </select>
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">Type</label>
	 
	   <select name="type">
	     <option>Select</option>
	     <option>Nati</option>
 	     <option>Faram</option>
	     <option>Ostrich</option>
	     <option>Duck</option>
	     <option>Snake</option>
	     <option>Crocodial</option>
	     <option>Birds</option>
	     
	   </select>
	</div>
	
	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   Price</label>
	  	   <input type="text" name="price" />

	   	</div>
	   	<div>
	   	   <label for="formGroupExampleInput" class="form-label">Quality</label>
	   	  
	   	   <select name="quality">
	   	   <option>Select</option>
	   	   	   	   <option>Select</option>
	   	   	   	   <option>1</option>
	   	   	   	   <option>2</option>
	   	   	   	   <option>3</option>
	   	   	   	   <option>4</option>
	   	   	   	   <option>5</option>
	   	   	   	   <option>6</option>
	   	   	   	   <option>7</option>
	   	   	   	   <option>10</option>
	   	   
	   	   </select>
	   	</div>
	   	
	   	<div>
	   <label for="formGroupExampleInput" class="form-label">
	   TakeAway</label>
	   Yes<input type="radio" value="true" name="takeAway" /> 
	   	   No<input type="radio" value="false" name="takeAway" /> 
	</div>
	
	<input type="submit" value="Order" class="btn btn-primary" />
	
	</form>


</body>

</html>