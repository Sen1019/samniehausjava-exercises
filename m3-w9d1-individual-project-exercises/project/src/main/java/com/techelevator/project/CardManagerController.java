package com.techelevator.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.project.model.CardDb;
import com.techelevator.project.model.CardDbDao;
import com.techelevator.project.model.Deck;
import com.techelevator.project.model.DeckDao;

import io.magicthegathering.javasdk.api.CardAPI;
import io.magicthegathering.javasdk.resource.Card;

@Controller
public class CardManagerController {
	
	@Autowired
	CardDbDao cardDbDao;

	@RequestMapping(value = {"/cardList"}, method = RequestMethod.GET)
	public String displayDeckList(ModelMap modelHolder) {
		modelHolder.put("cards", cardDbDao.getAllCards());
		return "cardList";
	}
	
	@RequestMapping(value = "/addCard", method = RequestMethod.GET)
	public String displayCreateDeck(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("cardList")){
			modelHolder.put("cardList", new ArrayList<CardDb>());
		}
		
		return "createDeck";
	}
	
	@RequestMapping(value = "/addCard", method = RequestMethod.POST)
	public String createDeck(@RequestParam String desiredName, ModelMap modelHolder){
		List<String> desiredNameList = new ArrayList<>();
		desiredNameList.add(desiredName);
		
		List<Card> possbileCards = CardAPI.getAllCards(desiredNameList);
		
		return "redirect:/addCard";
	}
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String displayDeckCreationConfirmation() {
		return "deckCreationConfirmation";
	}
}