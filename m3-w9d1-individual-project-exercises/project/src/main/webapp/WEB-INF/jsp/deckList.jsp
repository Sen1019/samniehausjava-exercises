<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Deck List"/>
<%@include file="common/header.jspf" %>

<h2>Deck List</h2>
<table>
  <tr>
    <th><strong>Deck</strong></th>
    <th><strong>Format</strong></th>
  </tr>
  <c:forEach var = "deck" items = "${decks}">
	  <tr class = "table-row">
	    <td><c:out value = "${deck.deckName}"/></td>
	    <td><c:out value = "${deck.deckFormat}"/></td>
	  </tr>
  </c:forEach>
</table>



<%@include file="common/footer.jspf" %>