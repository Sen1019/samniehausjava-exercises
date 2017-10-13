<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				list-style-type: none;
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
				 
		 <c:choose>
			<c:when test="${empty param.word}">
				<c:set var="word" value="Butt" />
			</c:when>
			<c:otherwise>
				<c:set var="word" value="${param.word}" />
			</c:otherwise>
		</c:choose>
		 <c:choose>
			<c:when test="${empty param.count}">
				<c:set var="count" value="69" />
			</c:when>
			<c:otherwise>
				<c:set var="count" value="${param.count}" />
			</c:otherwise>
		</c:choose>
		<c:set var="reverseCount" value = "${count}"/>
		
		<ul>
		 	<c:forEach begin = "1" end = "${count}" var = "counter">
		 		<li style = "font-size: ${reverseCount}px"><c:out value = "${word}"/></li>
		 		<c:set var="reverseCount" value = "${count - counter}"/>
		 	</c:forEach>
		</ul>
		
	</body>
</html>