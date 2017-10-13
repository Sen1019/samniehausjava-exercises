<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<c:set var = "pageTitle" value = "Product List"/>
<%@ include file = "common/header.jspf" %>


    <section id="main-content">
    
    	<h2>Toy Department</h2>
    	
		<ul>
		
			<c:forEach items = "${products}" var = "product">
			
				<div id = "list-item">
					
					<c:url var = "productLink" value = "productDetail?productId=${product.productId}"/>
					<a href = "${productLink}">
						<c:url var = "productImagePath" value = "/img/${product.imageName}" />
						<img src="${productImagePath}" id ="listToyPicture"/>
					</a>
					
					<div id = "list-product-info">
						
						<c:out value = "${product.name}"/>
						<div class = "best-seller"><c:out value = "${product.topSeller ? 'Best Seller!' : '' }"/></div><br/>
						<c:out value = "by ${product.manufacturer}"/><br/>
						<c:out value = "$ ${product.price}"/><br/>
						<strong>Weight</strong>
						<c:out value = "${product.weightInLbs} lbs"/><br/>
						<c:set var = "roundedRating">
					 		<f:formatNumber type="number" value="${product.averageRating}" pattern="#"/>
		  				</c:set>
       					<c:url var = "ratingImagePath" value = "/img/${roundedRating}-star.png"/>
       					<img src ="${ratingImagePath}" alt = "Star Rating of ${roundedRating}" id ="list-rating"/>
						
					
					
					</div>
				</div>
			</c:forEach>
		</ul>
    </section>
</body>
</html>