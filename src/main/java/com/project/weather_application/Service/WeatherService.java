package com.project.weather_application.Service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class WeatherService {

    private final RestClient weatherRestClient;

    @Value("${openweather.api.key}")
    private String apiKey;

    public WeatherService(RestClient weatherRestClient){
        this.weatherRestClient = weatherRestClient;
    }

    
}
