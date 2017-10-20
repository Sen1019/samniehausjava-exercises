<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<h1>Reverse Last Two Characters</h1>
	<c:forEach begin = "0" end = "9"  var = "count">
		<c:out value = "${lastTwo.words[count]} : ${lastTwo.lastTwoReversedWords[count]}"/><br/>
	</c:forEach>
		
</html>