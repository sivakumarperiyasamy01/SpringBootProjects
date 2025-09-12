package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class Weatherservice {

	@Value("${weather.api.key}")
	private String apikey;
	
	
	// apikey city url
	private final String apiurl = "https://api.openweathermap.org/data/2.5/weather?q={city}&appid={apikey}";

	public WeatherResponse getWeather(String city) {

		// to make external service call 
		RestTemplate restTemplate = new RestTemplate();

		return restTemplate.getForObject(apiurl, WeatherResponse.class, city, apikey);
	}
	
	/*
	 * 
	Spring Boot isn’t injecting those objects.
    Jackson is deserializing the HTTP JSON payload into your POJOs using reflection:
    calls default constructor → calls setters → returns populated object.
    
    
    create a new instance via reflection
    map JSON fields to properties.
	
	*/

}
