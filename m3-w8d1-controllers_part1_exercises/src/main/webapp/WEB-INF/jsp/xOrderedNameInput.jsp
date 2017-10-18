<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:url var="formAction" value="/xOrderedNameResult" />
	<form method="GET" action="${formAction}">
		<div>
			<label for="firstName">First Name:</label> 
			<input type="text" name="firstName" id="firstName" />
		</div>
		<div>
			<label for="middleInitial">Middle Initial:</label> 
			<input type="text" name="middleInitial" id="middleInitial" />
		</div>
		<div>
			<label for="lastName">Last Name:</label> 
			<input type="text" name="lastName" id="lastName" />
		</div>
		<div>
			<label for="order">Choose Order:</label>
			<input type="radio" name="order" value="fml"> First MI Last<br>
			<input type="radio" name="order" value="fl"> First Last<br>
			<input type="radio" name="order" value="lfm"> Last, First MI <br/>
			<input type="radio" name="order" value="lf"> Last, First
		</div>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</form>

</html>