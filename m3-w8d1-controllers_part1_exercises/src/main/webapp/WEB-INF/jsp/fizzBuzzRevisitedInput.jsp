<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:url var="formAction" value="/fizzBuzzRevisitedResult" />
	<form method="GET" action="${formAction}">
		<div>
			<label for="div1">Divisible By:</label> 
			<input type="number" name="div1" id="div1" />
		</div>
		<div>
			<label for="div2">Divisible By:</label> 
			<input type="number" name="div2" id="div2" />
		</div>
		<div>
			<label for="fizzAlt">Alternative Fizz:</label> 
			<input type="text" name="fizzAlt" id="fizzAlt" />
		</div>
		<div>
			<label for="buzzAlt">Last Name:</label> 
			<input type="text" name="buzzAlt" id="buzzAlt" />
		</div>
		
		<div>
			<label for="num1">Divisible By:</label> 
			<input type="number" name="nums" id="num1" /><br/>
			
			<label for="num2">Divisible By:</label> 
			<input type="number" name="nums" id="num2" /><br/>
			
			<label for="num3">Divisible By:</label> 
			<input type="number" name="nums" id="num3" /><br/>
			
			<label for="num4">Divisible By:</label> 
			<input type="number" name="nums" id="num4" /><br/>
			
			<label for="num5">Divisible By:</label> 
			<input type="number" name="nums" id="num5" /><br/>
		</div>
		<input class="formSubmitButton" type="submit" value="Submit" />
	</form>

</html>