package com.example.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)  // ignore the unknow properties mentioned over here when doing deserialztion by jackson library 
// entity class or pojo class 
public class WeatherResponse {

	private String name;
	private Main main;
	private Weather[] weather;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public Weather[] getWeather() {
		return weather;
	}

	public void setWeather(Weather[] weather) {
		this.weather = weather;
	}

	
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Main {
		private double temp;
		private int humidity;

		public double getTemp() {
			return temp;
		}

		public void setTemp(double temp) {
			this.temp = temp;
		}

		public int getHumidity() {
			return humidity;
		}

		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}

	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	public static class Weather{
		private String description;

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

}

// no argument constructor get called and jackson reads json and and inject fields deserilzation happended and object get injected 

