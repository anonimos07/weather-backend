package com.project.weather_application.Config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class WeatherConfig {

    @Value("${openweather.api.url}")
    private String apiURL;

    @Bean
    public RestClient weatherRestClient(){
        return RestClient.builder()
                .baseUrl(apiURL)
                .build();
    }

}
