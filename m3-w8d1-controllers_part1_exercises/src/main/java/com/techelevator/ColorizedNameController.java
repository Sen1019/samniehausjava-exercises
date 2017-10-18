package com.techelevator;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.ColorizedName;

@Controller 
public class ColorizedNameController {
	
	@RequestMapping("/colorizedNameInput")
	public String cNI() {
		return "colorizedNameInput";
	}
	
	@RequestMapping("/colorizedNameResult")
	public String cNR(@RequestParam String firstName,@RequestParam  String lastName,@RequestParam  String[] colors, ModelMap modelHolder) {
		
		ColorizedName colorizedName = new ColorizedName(firstName, lastName, colors);
		modelHolder.put("ColorizedName", colorizedName);
		
		return "colorizedNameResult";
	}

}
