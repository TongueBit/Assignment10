package com.coderscampus.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.dto.DayResponse;
import com.coderscampus.dto.WeekResponse;

import io.micrometer.common.util.StringUtils;



public class SpoonacularIntegration {

	public ResponseEntity<DayResponse> apiCallDay(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				  					  .queryParam("timeFrame", "day")
				  					  .queryParam("apiKey", "4d6a32fba1d242bbbdd38b13d5993328");
		if(!StringUtils.isEmpty(numCalories)) {
			builder.queryParam("targetCalories", numCalories)
				   .queryParam("diet", diet)
				   .queryParam("exclusions", exclusions);
		}
				  					  
		URI uri = builder.build().toUri();
		
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		System.out.println(response.getBody());
		return response;
	}
	
	public ResponseEntity<WeekResponse> apiCallWeek(String numCalories, String diet, String exclusions) {
		RestTemplate rt = new RestTemplate();
		
		UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
														   .queryParam("timeFrame", "week")
														   .queryParam("apiKey", "4d6a32fba1d242bbbdd38b13d5993328");
		if(!StringUtils.isEmpty(numCalories)) {
			builder.queryParam("targetCalories", numCalories)
			.queryParam("diet", diet)
			.queryParam("exclusions", exclusions);
		}

		URI uri = builder.build().toUri();

		ResponseEntity<WeekResponse> response = rt.getForEntity(uri, WeekResponse.class);
		System.out.println(response.getBody());
		return response;
	}
}
