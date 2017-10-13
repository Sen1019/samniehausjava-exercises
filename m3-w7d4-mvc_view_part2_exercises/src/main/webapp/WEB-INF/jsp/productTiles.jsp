<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var = "pageTitle" value = "Product Tiles"/>
<%@ include file = "common/header.jspf" %>

    <section id="tiles-main-content">
    	
    	<h2>Toy Department</h2>
    	
    	<div id="tiles">
    		
    		<c:forEach items = "${products}" var = "product">
    			<div id="tile-item">
    			
    				<c:url var = "productLink" value = "productDetail?productId=${product.productId}"/>
					<a href = "${productLink}">
	    				<c:url var = "productImagePath" value = "/img/${product.imageName}" />
						<img src="${productImagePath}" id ="tile-toy-picture"/><br/>
	    			</a>
	    			
	    			<h3><c:out value ="${product.name}"/></h3>
	    			<div class = "best-seller"><c:out value ="${product.topSeller ? 'Best Seller!' : '' }"/></div>
	    			
	    			<c:out value ="by ${product.manufacturer}"/><br/>
	    			
	    			<c:if test = "${product.remainingStock <= 3}">
	    				<div  class = "low-stock"><c:out value = "Only ${product.remainingStock} left!"/></div>
	    			</c:if>
	    			
	    			<div id = "table-price"><c:out value ="$ ${product.price}" /></div>
	    			
	    			<strong>Weight</strong>
					<c:out value = "${product.weightInLbs} lbs"/><br/><br/><br/>
					
        		</div>			
    		</c:forEach>
    	</div>
    </section>
</body>
</html>