package com.coderscampus.spoonacular;

import java.net.URI;

import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.coderscampus.dto.DayResponse;



public class SpoonacularIntegration {

	@Test
	public ResponseEntity<DayResponse> apiCallDay() {
		RestTemplate rt = new RestTemplate();
		
		URI uri = UriComponentsBuilder.fromHttpUrl("https://api.spoonacular.com/mealplanner/generate")
				  					  .queryParam("timeFrame", "day")
				  					  .queryParam("apiKey", "4d6a32fba1d242bbbdd38b13d5993328")
				  					  .build()
				  					  .toUri();
		
		ResponseEntity<DayResponse> response = rt.getForEntity(uri, DayResponse.class);
		//ResponseEntity<AlphaAdvantageResponse> response = rt.getForEntity(uri, AlphaAdvantageResponse.class);
		System.out.println(response.getBody());
		return response;
	}
}
