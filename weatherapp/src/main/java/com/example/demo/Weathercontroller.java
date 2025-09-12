package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Weathercontroller {

	@Autowired
	private Weatherservice service;

	@GetMapping("/")
	public String display() {
		return "Weather";
	}

	@GetMapping("weather")
	public String showWeatherdetails(@RequestParam String city, Model model) {
		
		WeatherResponse response=service.getWeather(city);
		model.addAttribute("weather", response);
		return "Weather";
	}

}
