<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Login"/>
<%@include file="common/header.jspf" %>

<h2>Registration</h2>

		<c:url var = "registrationUrl" value = "/register"/>
		<form:form method = "POST" action = "${registrationUrl}" modelAttribute="registration">
			<div>
				<label for ="firstName">First Name: </label>
				<form:input path = "firstName" />*
				<form:errors path="firstName" cssClass="error"/>
			</div>
			<div>
				<label for ="lastName">Last Name: </label>
				<form:input path = "lastName" />*
				<form:errors path="lastName" cssClass="error"/>
			</div>			
			<div>
				<label for ="email">Email Address: </label>
				<form:input path = "email" />*
				<form:errors path="email" cssClass="error"/>
			</div>
			<div>
				<label for ="confirmEmail">Confirm Email Address: </label>
				<form:input path = "confirmEmail" />*
				<form:errors path="confirmEmail" cssClass="error"/>
				<form:errors path="emailMatching" cssClass="error"/>
			</div>			
			<div>
				<label for ="password">Password: </label>
				<form:password path = "password" />*
				<form:errors path="password" cssClass="error"/>
			</div>
			<div>
				<label for ="confirmPassword">Confirm Password: </label>
				<form:password path = "confirmPassword" />*
				<form:errors path="confirmPassword" cssClass="error"/>
				<form:errors path="passwordMatching" cssClass="error"/>
			</div>
			<div>
				<label for ="birthDate">Birth date (MM/DD/YYYY): </label>
				<form:input path = "birthDate" />*
				<form:errors path="birthDate" cssClass="date-error"/>
			</div>
			<div>
				<label for ="numberOfTickets">Number of Tickets</label>
				<form:input path = "numberOfTickets" />*
				<form:errors path="numberOfTickets" cssClass="error"/>
			</div>
			<div>
				<input type = "submit" value = "Register"/>
			</div>
		</form:form>

<%@include file="common/footer.jspf" %>