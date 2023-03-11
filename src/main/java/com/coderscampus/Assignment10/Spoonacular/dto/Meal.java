package com.coderscampus.Assignment10.Spoonacular.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Meal {
	
	@JsonProperty("id")
	Long id;
	@JsonProperty("imageType")
    String imageType;
	@JsonProperty("title")
    String title;
	@JsonProperty("readyInMinutes")
    Integer readyInMinutes;
	@JsonProperty("servings")
    Integer servings;
	@JsonProperty("sourceUrl")
    String sourceUrl;
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImageType() {
		return imageType;
	}
	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReadyInMinutes() {
		return readyInMinutes;
	}
	public void setReadyInMinutes(Integer readyInMinutes) {
		this.readyInMinutes = readyInMinutes;
	}
	public Integer getServings() {
		return servings;
	}
	public void setServings(Integer servings) {
		this.servings = servings;
	}
	public String getSourceUrl() {
		return sourceUrl;
	}
	public void setSourceUrl(String sourceUrl) {
		this.sourceUrl = sourceUrl;
	}
    
    
}
