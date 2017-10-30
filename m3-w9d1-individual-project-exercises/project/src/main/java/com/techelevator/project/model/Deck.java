package com.techelevator.project.model;

public class Deck {
	private Long deckId;
	private String deckName;
	private String deckFormat;
	
	public Long getDeckId() {
		return deckId;
	}
	public void setDeckId(Long deckId) {
		this.deckId = deckId;
	}
	public String getDeckName() {
		return deckName;
	}
	public void setDeckName(String deckName) {
		this.deckName = deckName;
	}
	public String getDeckFormat() {
		return deckFormat;
	}
	public void setDeckFormat(String deckFormat) {
		this.deckFormat = deckFormat;
	}
	
	
}
