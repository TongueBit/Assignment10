package com.coderscampus.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DayResponse {

	@JsonProperty("meals")
	private List<Meal> mealPlan;
	
	private Nutrients nutrients;

	public List<Meal> getMealPlan() {
		return mealPlan;
	}
	public void setMealPlan(List<Meal> mealPlan) {
		this.mealPlan = mealPlan;
	}
	public Nutrients getNutrients() {
		return nutrients;
	}
	public void setNutrients(Nutrients nutrients) {
		this.nutrients = nutrients;
	}
	
	
}
