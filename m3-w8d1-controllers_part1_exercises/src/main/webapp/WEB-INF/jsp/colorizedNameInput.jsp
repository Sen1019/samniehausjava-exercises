<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:url var="formAction" value="/colorizedNameResult" />
	<form method="GET" action="${formAction}">
		<div>
			<label for="firstName">First Name:</label> 
			<input type="text" name="firstName" id="firstName" />
		</div>
		<div>
			<label for="lastName">Last Name:</label> 
			<input type="text" name="lastName" id="lastName" />
		</div>
		<div>
			<label for="order">Choose Color:</label>
			<input type="checkbox" name="colors" value="r"> Red<br>
			<input type="checkbox" name="colors" value="g"> Green<br>
			<input type="checkbox" name="colors" value="b"> Blue <br/>
		</div>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</form>

</html>