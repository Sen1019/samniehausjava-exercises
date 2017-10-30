<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="Card Collection"/>
<%@include file="common/header.jspf" %>

<h2>Card Collection</h2>
<table>
  <tr>
    <th><strong>Card</strong></th>
    <th><strong>Quantity</strong></th>
  </tr>
  <c:forEach var = "deck" items = "${cards}">
	  <tr class = "table-row">
	    <td><c:out value = "${card.name}"/></td>
	    <td><c:out value = "${card.quantity}"/></td>
	  </tr>
  </c:forEach>
</table>



<%@include file="common/footer.jspf" %>