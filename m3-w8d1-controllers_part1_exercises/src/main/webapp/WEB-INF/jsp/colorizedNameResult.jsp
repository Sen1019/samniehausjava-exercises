<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:out value = "First name: ${ColorizedName.firstName}"/><br/>
	<c:out value = "Last name: ${ColorizedName.lastName}"/><br/><br/>

	<c:if test = "${ColorizedName.red}">
		<p style = "color: red"><c:out value = "${ColorizedName.firstName} ${ColorizedName.lastName}"/></p>
	</c:if>
	<c:if test = "${ColorizedName.green}">
		<p style = "color: green"><c:out value = "${ColorizedName.firstName} ${ColorizedName.lastName}"/></p>
	</c:if>
	<c:if test = "${ColorizedName.blue}">
		<p style = "color: blue"><c:out value = "${ColorizedName.firstName} ${ColorizedName.lastName}"/></p>
	</c:if>
		
</html>