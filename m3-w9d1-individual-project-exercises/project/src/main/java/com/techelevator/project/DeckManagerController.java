package com.techelevator.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.project.model.Deck;
import com.techelevator.project.model.DeckDao;


@Controller 
public class DeckManagerController {
	
	@Autowired
	DeckDao deckDao;

	@RequestMapping(value = {"/","/deckList"}, method = RequestMethod.GET)
	public String displayDeckList(ModelMap modelHolder) {
		modelHolder.put("decks", deckDao.getAllDecks());
		return "deckList";
	}
	
	@RequestMapping(value = "/createDeck", method = RequestMethod.GET)
	public String displayCreateDeck(ModelMap modelHolder){
		if(! modelHolder.containsAttribute("desiredDeck")){
			modelHolder.put("desiredDeck", new Deck());
		}
		
		return "createDeck";
	}
	
	@RequestMapping(value = "/createDeck", method = RequestMethod.POST)
	public String createDeck(@ModelAttribute Deck desiredDeck, RedirectAttributes flash){
		flash.addFlashAttribute("desiredDeck", desiredDeck);		
		if(deckDao.isNameNotAvailable(desiredDeck)){
			flash.addFlashAttribute("nameTaken", true);
			return "redirect:/createDeck";
		}
		
		deckDao.createDeck(desiredDeck);
		
		
		return "redirect:/deckCreationConfirmation";
	}
	
	@RequestMapping(value = "/deckCreationConfirmation", method = RequestMethod.GET)
	public String displayDeckCreationConfirmation() {
		return "deckCreationConfirmation";
	}
}
