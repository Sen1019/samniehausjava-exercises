package com.techelevator.project.model;

import io.magicthegathering.javasdk.resource.Card;

@SuppressWarnings("serial")
public class CardDb extends Card {

	private int quantity;

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantityOwned) {
		this.quantity = quantityOwned;
	}
	
	
}
