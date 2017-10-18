<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:out value = "Divisible By: ${FizzBuzzRevisited.div1}"/><br/>
	<c:out value = "Divisible By: ${FizzBuzzRevisited.div2}"/><br/>
	<c:out value = "Divisible By Both: ${FizzBuzzRevisited.div1} and ${FizzBuzzRevisited.div2}"/><br/><br/>
	
	<c:out value = "Alternative Fizz: ${FizzBuzzRevisited.fizzAlt}"/><br/>
	<c:out value = "Alternative Buzz: ${FizzBuzzRevisited.buzzAlt}"/><br/><br/>

	<span style="white-space: pre-line">
		<c:out value = "${FizzBuzzRevisited.fizzBuzz}"/><br/>
	</span>
		
</html>