<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<c:set var="pageTitle" value="Create Deck"/>
<%@include file="common/header.jspf" %>

<h2>Create Deck</h2>

		<c:url var = "createDeckUrl" value = "/createDeck"/>
		<form:form method = "POST" action = "${createDeckUrl}" modelAttribute = "desiredDeck">

			<div>
				<label for ="deckName">Deck Name</label>
				<form:input path = "deckName" />*
				<c:if test = "${nameTaken}">
					<c:out value = "Please enter a name that is not taken."/>
				</c:if>
			</div>
			<div>
				<label for ="deckFormat">Deck Format</label>
				<form:select path = "deckFormat">
	            	<form:option  value = "Constructed" label = "Constructed"/>
	            	<form:option  value = "Limited" label = "Limited"/>
	            	<form:option  value = "Commander" label = "Commander"/>
           		</form:select>
			
			</div><br/>
			<div>
				<input type = "submit" value = "Create Deck"/>
			</div>
		</form:form>



<%@include file="common/footer.jspf" %>