package com.techelevator.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;


@Component
public class JdbcDeckDao implements DeckDao{
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcDeckDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Deck> getAllDecks() {
		List<Deck> allDecks = new ArrayList<>();
		String sqlSelectAllDecks = "SELECT * FROM deck";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllDecks);
		while(results.next()) {
			Deck deck = new Deck();
			deck.setDeckId(results.getLong("deck_id"));
			deck.setDeckName(results.getString("deck_name"));
			deck.setDeckFormat(results.getString("deck_format"));
			allDecks.add(deck);
		}
		return allDecks;
	}

	@Override
	public void createDeck(Deck deck) {
		String sqlInsertDeck = "INSERT INTO deck (deck_name, deck_format) VALUES (?,?)";
		jdbcTemplate.update(sqlInsertDeck, deck.getDeckName(), deck.getDeckFormat());
	}

	@Override
	public void deleteDeck(Long deckId) {
		String sqlDeleteDeck = "DELETE FROM deck WHERE deck_id = ?";
		jdbcTemplate.update(sqlDeleteDeck, deckId);
	}

	@Override
	public boolean isNameNotAvailable(Deck desiredDeck){
		String sqlCheckName = "SELECT COUNT(*) FROM deck WHERE deck_name = ?";
		return (jdbcTemplate.queryForObject(sqlCheckName, Integer.class, desiredDeck.getDeckName()) != 0);
	}

}
