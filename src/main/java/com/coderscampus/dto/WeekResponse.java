package com.coderscampus.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeekResponse {

	@JsonProperty
	private Week week;

	public Week getWeek() {
		return week;
	}

	public void setWeek(Week week) {
		this.week = week;
	}
}
