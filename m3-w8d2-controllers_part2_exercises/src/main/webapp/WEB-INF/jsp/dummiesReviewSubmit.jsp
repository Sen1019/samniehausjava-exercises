<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title><c:out value = "${pageTitle}"/></title>
	</head>

	<body>
		<div style = "border-bottom: 1px solid black">
			<c:url var = "dummiesImageUrl" value = "/etc/forDummies.png"/>
			<img src = "${dummiesImageUrl}"/>
		</div>
	<form method="POST">
	
				<div>
					<label for="username">Username:</label>
					<input type="text" name="username" id="username" />
				</div>
				
				<label for="rating">Rating: </label>
				<select name="rating" id="rating">
					<option value="1">1</option>
					<option value="2">2</option>
					<option value="3">3</option>
					<option value="4">4</option>
					<option value="5">5</option>
				</select>
				
				<div>		
					<label for="title">Review Title: </label>
					<input type="text" name="title" id="title" />
				</div>	
				
				<div>		
					<label for="text">Review Text: </label>
					<input type="text" name="text" id="text" />
				</div>
				
				<div>
					<input type="submit" value="Submit Review" />
				</div>		
			</form>

	</body>
</html>