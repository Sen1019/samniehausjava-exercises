package com.techelevator.project.model;

import java.util.List;

public interface CardDbDao {
	
	public List<CardDb> getAllCards();
	
	public CardDb getCardByMultiverseId(int multiverseId);

}
