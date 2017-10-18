<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	
	<c:out value = "First name: ${xOrderedName.firstName}"/><br/>
	<c:out value = "Middle initial: ${xOrderedName.middleInitial}"/><br/>
	<c:out value = "Last name: ${xOrderedName.lastName}"/><br/><br/>
	<c:out value = "Ordered: ${xOrderedName.fullName}"/>
	
	
</html>