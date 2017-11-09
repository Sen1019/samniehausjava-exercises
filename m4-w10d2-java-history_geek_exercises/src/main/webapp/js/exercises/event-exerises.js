/// <reference path="../jquery-3.1.1.js" />

$(document).ready(function () {

	$("#SameShipping").on('click', function(){
		$("#ShippingAddress1").val($("#BillingAddress1").val());
		$("#ShippingAddress2").val($("#BillingAddress2").val());
		$("#ShippingCity").val($("#BillingCity").val());
		$("#ShippingState").val($("#BillingState").val());
		$("#ShippingPostalCode").val($("#BillingPostalCode").val());
	});
	
	$("input[name=ShippingType]").on('click', function(){
		
		var shipping = parseFloat($(this).attr("data-cost"));
		var subtotal = Number($('#subtotal > .price').text().replace(/[^0-9\.-]+/g,""));
		var tax = Number($("#tax > .price").text().replace(/[^0-9\.-]+/g,""));
		var total = (shipping + tax + subtotal).toFixed(2);
		$("#shipping > .price").text('$' + shipping);
		$("#grandtotal > .price").text('$' + total);
		
	})
});