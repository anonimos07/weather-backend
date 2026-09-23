package com.project.weather_application.Service;


import com.project.weather_application.DTO.WeatherDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import tools.jackson.databind.JsonNode;

@Service
public class WeatherService {

    private final RestClient weatherRestClient;

    @Value("${openweather.api.key}")
    private String apiKey;

    public WeatherService(RestClient weatherRestClient){
        this.weatherRestClient = weatherRestClient;
    }

    public WeatherDTO getWeather(String city){

        JsonNode response = weatherRestClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("q", city)
                        .queryParam("appid", apiKey)
                        .queryParam("units", "metric")
                        .build())
                .retrieve()
                .body(JsonNode.class);
        String cityName = response.get("name").asText();

        double temperature =
                response.get("main").get("temp").asDouble();

        double feelsLike =
                response.get("main").get("feels_like").asDouble();

        int humidity =
                response.get("main").get("humidity").asInt();

        String description =
                response.get("weather").get(0).get("description").asText();

        String main =
                response.get("weather").get(0).get("main").asText();

        double windSpeed =
                response.get("wind").get("speed").asDouble();

        return new WeatherDTO(
                cityName,
                temperature,
                feelsLike,
                humidity,
                description,
                main,
                windSpeed
        );
    }
}
