package com.farukbozan.projecte.spring.ai.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(value = "weather")
public record WeatherConfig(String apiKey, String apiUrl) {
}
