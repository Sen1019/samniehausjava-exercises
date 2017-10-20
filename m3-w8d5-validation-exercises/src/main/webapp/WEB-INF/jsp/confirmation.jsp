<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Confirmation"/>
<%@include file="common/header.jspf" %>

	<c:if test = "${login.email != null}">
		<h2><c:out value = "Welcome, ${login.email}"/></h2>
	</c:if>
	
	<c:if test = "${registration.email != null}">
		<h2><c:out value = "Welcome, ${registration.email}"/></h2>
	</c:if>

<%@include file="common/footer.jspf" %>