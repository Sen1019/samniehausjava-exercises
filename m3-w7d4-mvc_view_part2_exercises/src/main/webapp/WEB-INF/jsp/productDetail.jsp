<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var = "pageTitle" value = "${product.name}"/>
<%@ include file = "common/header.jspf" %>
		<section id="main-content">
	
			<div id = "detail-containter">
			
				<div id ="detail-picture-container"/>
					<br/>
					<c:url var = "productImagePath" value = "/img/${product.imageName}" />
					<img src="${productImagePath}" id ="detail-picture"/>
				</div>
				
				<div id = "detail-info">
					
					<br/><br/>
					<span>
						<strong id = "detail-product-name"><c:out value = "${product.name}"/></strong>
						<span class = "best-seller"><c:out value = "${product.topSeller ? 'Best Seller!' : '' }"/></span>
					</span><br/>
				
					<c:out value = "by ${product.manufacturer}"/><br/>
				
					<c:set var = "roundedRating">
					 		<f:formatNumber type="number" value="${product.averageRating}" pattern="#"/>
		  			</c:set>
		  			<c:url var = "ratingImagePath" value = "/img/${roundedRating}-star.png"/>
       				<img src ="${ratingImagePath}" alt = "Star Rating of ${roundedRating}" id ="detail-rating-img"/>
       				<br/><br/>
       				

	       			<c:out value ="$ ${product.price}" /><br/>

       				
       				<strong>Weight</strong>
					<c:out value = "${product.weightInLbs} lbs"/><br/><br/>
					
					<span>
						<strong>Description:</strong>	
						<c:out value = "${product.description}"/>
						
					</span>
					
				
				
				</div>
		
				
		
		
		
		
			</div>
		</section>
	</body>
</html>