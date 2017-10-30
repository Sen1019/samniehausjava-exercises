package com.techelevator.project.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JdbcCardDbDao implements CardDbDao {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public JdbcCardDbDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<CardDb> getAllCards() {
		List<CardDb> allCards = new ArrayList<>();
		String sqlSelectAllDecks = "SELECT * FROM card";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllDecks);
		while(results.next()) {
			CardDb card = new CardDb();
			card.setMultiverseid(results.getInt("multiverse_id"));
			card.setName(results.getString("name"));
			card.setQuantity(results.getInt("quantity"));
			allCards.add(card);
		}
		return allCards;
	}

	@Override
	public CardDb getCardByMultiverseId(int multiverseId) {
		String sqlSelectAllDecks = "SELECT * FROM card WHERE multiverse_id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllDecks, multiverseId);
		CardDb card = new CardDb();
		results.next();
		card.setMultiverseid(results.getInt("multiverse_id"));
		card.setName(results.getString("name"));
		card.setQuantity(results.getInt("quantity"));
		return card;
	}
}
