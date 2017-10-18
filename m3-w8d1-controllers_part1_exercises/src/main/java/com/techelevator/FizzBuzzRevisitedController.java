package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.FizzBuzzRevisited;

@Controller 
public class FizzBuzzRevisitedController {
	
	@RequestMapping("/fizzBuzzRevisitedInput")
	public String fBRI() {
		return "fizzBuzzRevisitedInput";
	}
	
	@RequestMapping("/fizzBuzzRevisitedResult")
	public String fBRR(@RequestParam int div1, @RequestParam int div2, String fizzAlt,@RequestParam  String buzzAlt,
			@RequestParam  int[] nums, ModelMap modelHolder) {
		
		FizzBuzzRevisited fizzBuzzRevisited = new FizzBuzzRevisited(div1, div2, fizzAlt, buzzAlt, nums);
		modelHolder.put("FizzBuzzRevisited", fizzBuzzRevisited);
		
		return "fizzBuzzRevisitedResult";
	}

}
