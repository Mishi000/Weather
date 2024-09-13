package com.csc340.demo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/weather")

public class WeatherAPIController {

    Weather weather;

    @GetMapping("{weather}")
    public Weather getWeather() {
        //String url = ""; //Api url
        return weather;
                //("City","Code", "Temp","Speed");
    }

    @PostMapping
    public String createWeatherDetails(@RequestBody Weather weather) {

        this.weather = weather;
        return "Weather Created Successfully";
    }

    @PutMapping
    public String updateWeatherDetails(@RequestBody Weather weather) {

        this.weather = weather;
        return "Weather Updated Successfully";
    }
}
