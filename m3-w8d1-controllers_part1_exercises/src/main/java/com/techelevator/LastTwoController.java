package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.LastTwo;

@Controller 
public class LastTwoController {
	
	@RequestMapping("/lastTwoInput")
	public String lTI() {
		return "lastTwoInput";
	}
	
	@RequestMapping("/lastTwoResult")
	public String lTR(@RequestParam String[] words, ModelMap modelHolder) {
		
		LastTwo lastTwo = new LastTwo(words);
		modelHolder.put("lastTwo", lastTwo);
		
		return "lastTwoResult";
	}

}

