package com.farukbozan.projecte.spring.ai.config;

import com.farukbozan.projecte.spring.ai.service.WeatherService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import java.util.function.Function;

@Configuration
public class FunctionConfig {

    private final WeatherConfig weatherConfig;

    public FunctionConfig(WeatherConfig weatherConfig) {
        this.weatherConfig = weatherConfig;
    }

    @Bean
    @Description("Get current weather for given city")
    public Function<WeatherService.Request, WeatherService.Response> currentWeatherFunction() {
        return new WeatherService(weatherConfig);
    }
}
