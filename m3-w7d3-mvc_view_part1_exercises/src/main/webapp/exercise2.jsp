<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 2 - Fibonacci 25</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 2 - Fibonacci 25</h1>
		<ul>
			<%--
				Add a list item (i.e. <li>) for each of the first 25 numbers in the Fibonacci sequence
				
				See exercise2-fibonacci.png for example output
			 --%>
			 <c:set var = "fibNumber" value = "1"/>
			 
			 <c:forEach begin = "1" end = "25" var = "count">
			 <li><c:out  value = "${fibNumber}"/></li>
				 <c:set var = "fibNumber">
				 	<f:formatNumber type="number" value="${fibNumber * 1.61803398875}" pattern="#"/>
	  			</c:set>
  			</c:forEach>
		</ul>
	</body>
</html>