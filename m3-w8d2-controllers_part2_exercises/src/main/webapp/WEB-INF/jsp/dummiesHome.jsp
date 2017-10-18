<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<title><c:out value = "${pageTitle}"/></title>
	</head>

	<body>
		<div style = "border-bottom: 1px solid black">
			<c:url var = "dummiesImageUrl" value = "/etc/forDummies.png"/>
			<img src = "${dummiesImageUrl}"/>
		</div>
	
		<c:forEach var = "review" items = "${reviews}">
		
			<div style = "border-bottom: 1px solid black">
				
				<span>
					<span><strong><c:out value = "${review.title}"/></strong></span>
					<span><c:out value = "(${review.username})"/></span>			
				</span><br/>
				
				<c:out value = "${review.dateSubmitted}"/><br/>
				
				<c:url var = "dummiesRatingUrl" value = "/etc/star.png"/>
				<span>
					<c:forEach begin ="0" end = "6" var = "rating">
						<c:if test = "${rating < review.rating}">
							<span><img src = "${dummiesRatingUrl}"/></span>
						</c:if>
					</c:forEach>
				</span>	
				
				<p>
					<c:out value = "${review.text}"/>
				</p>
			</div>
		</c:forEach>
		
		<c:url var = "dummiesReviewSubmitUrl" value = "/dummiesReviewSubmit"/>
		<h3><a href = "${dummiesReviewSubmitUrl}">Submit a Review!</a></h3>
	</body>
</html>