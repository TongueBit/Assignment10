package com.coderscampus.web;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coderscampus.dto.DayResponse;
import com.coderscampus.dto.WeekResponse;
import com.coderscampus.spoonacular.SpoonacularIntegration;

@RestController
public class MealPlannerController {

	
	@GetMapping("mealplanner/week") 
	public ResponseEntity<WeekResponse>getWeekMeals(String numCalories, String diet, String exclusions) { 
		return null; 
	}

	@GetMapping("mealplanner/day") public ResponseEntity<DayResponse>getDayMeals(String numCalories, String diet, String exclusions) {
		SpoonacularIntegration responseEntity = new SpoonacularIntegration(); //
		
		return responseEntity.apiCallDay();  
	}


	@GetMapping("/")
	public String testGetMapping() {
		return "It's working";
	}
}
