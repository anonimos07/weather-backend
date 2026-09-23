package com.project.weather_application.DTO;

import lombok.Getter;
import lombok.Setter;

//@Getter
//@Setter
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

    public String getCity() {
        return city;
    }

    public double getTemperature() {
        return temperature;
    }

    public double getFeelsLike() {
        return feelsLike;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getDescription() {
        return description;
    }

    public String getMain() {
        return main;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public void setFeelsLike(double feelsLike) {
        this.feelsLike = feelsLike;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }
}
