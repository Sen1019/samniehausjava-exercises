/// <reference path="../jquery-3.1.1.js" />


$(document).ready(function () {
	
    $("#BillingPostalCode").on("change", function(event){
    	$.ajax({
    		url:"http://localhost:8080/m4-java-historygeek-exercises/api/getTax",
    		method:"GET",
    		data:{
    			'billingZipCode' : $(this).val(),
    			'subtotal' : $("#subtotal .price").text().replace("$", "")
    			
    		}
    	}).then(function(data){
    		var result = JSON.parse(data);
    		$("#tax .price").text("$" + result.tax);
    		
    		var shipping = Number($("#shipping > .price").text().replace(/[^0-9\.-]+/g,""));
    		var subtotal = Number($('#subtotal > .price').text().replace(/[^0-9\.-]+/g,""));
    		var tax = Number($("#tax > .price").text().replace(/[^0-9\.-]+/g,""));
    		var total = (shipping + tax + subtotal).toFixed(2);
    		$("#grandtotal > .price").text('$' + total);
    	})
    	
    })

});