package com.project.weather_application.Controller;


import com.project.weather_application.DTO.WeatherDTO;
import com.project.weather_application.Service.WeatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/weather")
public class WeatherController {

    public final WeatherService weatherService;

    public WeatherController(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @GetMapping
    public WeatherDTO getWeather(@RequestParam String city){
        return weatherService.getWeather(city);
    }
}
