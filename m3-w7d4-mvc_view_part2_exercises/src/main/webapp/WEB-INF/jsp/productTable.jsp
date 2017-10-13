<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f" %>

<c:set var = "pageTitle" value = "Product Table"/>
<%@ include file = "common/header.jspf" %>


    <section id="table-main-content">

		<h2>Toy Department</h2>
		
		<table id = "table-toy">
		
			<tr>
				<th></th>
				<c:forEach items = "${products}" var = "product">
					<th>
						<c:url var = "productLink" value = "productDetail?productId=${product.productId}"/>
						<a href = "${productLink}">
							<c:url var = "productImagePath" value = "/img/${product.imageName}" />
							<img src="${productImagePath}" id ="tableToyPicture"/><br/>
						</a>
						<div class = "best-seller"><c:out value ="${product.topSeller ? 'Best Seller!' : '' }"/></div>					
					</th>
				</c:forEach>
			</tr>
			
			<tr class = "greyed" id = "table-name">
				<th>Name</th>
				<c:forEach items = "${products}" var = "product">
					<td>
						<c:out value ="${product.name}"/>
					</td>	
				</c:forEach>
			</tr>
			
			<tr>
				<th>Rating</th>
				<c:forEach items = "${products}" var = "product">
					<td>
						<c:set var = "roundedRating">
					 		<f:formatNumber type="number" value="${product.averageRating}" pattern="#"/>
		  				</c:set>
       					<c:url var = "ratingImagePath" value = "/img/${roundedRating}-star.png"/>
       				<img src ="${ratingImagePath}" alt = "Star Rating of ${roundedRating}" id ="table-rating-img"/>
					</td>	
				</c:forEach>
			</tr>
			
			<tr class = "greyed" id = "table-Mfr">
				<th>Mfr</th>
				<c:forEach items = "${products}" var = "product">
					<td>
						<c:out value ="${product.manufacturer}"/>
					</td>	
				</c:forEach>
			</tr>			
			
			<tr>
				<th>Price</th>
				<c:forEach items = "${products}" var = "product">
					<td>
						<div id = "table-price"><c:out value ="$ ${product.price}" /></div>
					</td>	
				</c:forEach>
			</tr>	
			
			<tr class = "greyed" id = "table-weight">
				<th>wt. (in lbs)</th>
				<c:forEach items = "${products}" var = "product">
					<td>
						<c:out value ="${product.weightInLbs}"/>
					</td>	
				</c:forEach>
			</tr>			
				
		</table>
    </section>
</body>
</html>