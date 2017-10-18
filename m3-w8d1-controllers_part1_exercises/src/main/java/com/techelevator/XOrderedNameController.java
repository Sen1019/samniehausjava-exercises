package com.techelevator;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.model.xOrderedName;

@Controller 
public class XOrderedNameController {

	@RequestMapping("/xOrderedNameInput")
	public String xONI() {
		return "xOrderedNameInput";
	}
	
	@RequestMapping("/xOrderedNameResult")
	public String xONR(@RequestParam String firstName,@RequestParam  String lastName,@RequestParam  String middleInitial,@RequestParam  String order, ModelMap modelHolder) {
		
		xOrderedName xorderedName = new xOrderedName(firstName, lastName, middleInitial, order);
		modelHolder.put("xOrderedName", xorderedName);
		
		return "xOrderedNameResult";
	}
}
