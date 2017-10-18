package com.techelevator;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller
public class DummiesController {
	
	@Autowired
	ReviewDao reviewDao;
	
	@RequestMapping({"/", "/dummiesHome"})
	public String dummiesHome(ModelMap modelHolder){
		
		modelHolder.put("reviews", reviewDao.getAllReviews());
		
		return "dummiesHome";
	}
	
	@RequestMapping(path = "dummiesReviewSubmit", method=RequestMethod.GET)
	public String dummiesReviewSubmitGet(){
		return "dummiesReviewSubmit";
	}
	
	@RequestMapping(path = "dummiesReviewSubmit", method=RequestMethod.POST)
	public String dummiesReviewSubmitPush(@ModelAttribute Review review){
		review.setDateSubmitted(LocalDateTime.now());
		reviewDao.save(review);
		
		return "redirect:/dummiesHome";
	}

}
