package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.LastTwo;

@Controller 
public class BabyLottoController {
	
	@RequestMapping("/babyLottoInput")
	public String bLI() {
		return "babyLottoInput";
	}
	
	@RequestMapping("/babyLottoResult")
	public String lTR(@RequestParam String[] tickets, ModelMap modelHolder) {
		
//		TicketMaker ticketMaker = new TicketMaker(tickets);
//		modelHolder.put(
		
		return "babyLottoResult";
	}

}
