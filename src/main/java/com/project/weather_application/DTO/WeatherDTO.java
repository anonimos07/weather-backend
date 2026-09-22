package com.project.weather_application.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WeatherDTO {

    private String city;
    private double temperature;
    private double feelsLike;
    private int humidity;
    private String description;
    private String main;
    private double windSpeed;

    public WeatherDTO(){

    }

    public WeatherDTO(String city,
                      double temperature,
                      double feelsLike,
                      int humidity,
                      String description,
                      String main,
                      double windSpeed){
        this. city = city;
        this.temperature = temperature;
        this.feelsLike = feelsLike;
        this.humidity = humidity;
        this.description = description;
        this.main = main;
        this.windSpeed = windSpeed;
    }
}
