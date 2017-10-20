<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<h1>Reverse Last Two Characters</h1>
	<c:url var="formAction" value="/lastTwoResult" />
	<form method="GET" action="${formAction}">
		<c:forEach begin= "1" end = "10" var = "count">
			<div>
				<label for="Word${count}"><c:out value = "Word ${count}:"/></label> 
				<input type="text" name="words" id="Word${count}" />
			</div>
		</c:forEach>									
		<input class="formSubmitButton" type="submit" value="Submit" />
	</form>

</html>