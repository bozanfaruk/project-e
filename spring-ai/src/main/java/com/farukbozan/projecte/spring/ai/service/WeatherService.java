package com.farukbozan.projecte.spring.ai.service;

import com.farukbozan.projecte.spring.ai.config.WeatherConfig;
import org.springframework.web.client.RestClient;

import java.util.function.Function;

public class WeatherService implements Function<WeatherService.Request, WeatherService.Response> {

    private final WeatherConfig weatherConfig;
    private final RestClient restClient;

    public WeatherService(WeatherConfig weatherConfig) {
        this.weatherConfig = weatherConfig;
        this.restClient = RestClient.create(weatherConfig.apiUrl());
    }

    @Override
    public Response apply(Request request) {
        return restClient.get()
                         .uri("/current.json?key={key}&q={q}", weatherConfig.apiKey(), request.city())
                         .retrieve()
                         .body(Response.class);
    }


    public record Request(String city) {
    }

    public record Response(Location location, Current current) {
    }

    public record Location(String name, String region, String country, Long lat, Long lon) {
    }

    public record Current(String temp_c, Condition condition, String wind_kph, String humidity) {
    }

    public record Condition(String text) {
    }
}
