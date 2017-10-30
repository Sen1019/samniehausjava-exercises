package com.techelevator.project.model;

import java.util.List;

public interface DeckDao {
	
	public List<Deck> getAllDecks();
	public void createDeck(Deck deck);
	public void deleteDeck(Long deckId);
	public boolean isNameNotAvailable(Deck desiredDeck);

}
