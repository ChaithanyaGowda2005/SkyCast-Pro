package com.chaithanya.skycast.service;

import com.chaithanya.skycast.api.WeatherApiClient;
import com.chaithanya.skycast.model.Weather;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.DeserializationFeature;
public class WeatherService {

    private final WeatherApiClient apiClient = new WeatherApiClient();

    private final ObjectMapper mapper = new ObjectMapper()
            .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public Weather getWeather(String city) throws Exception {

        String json = apiClient.getWeatherData(city);

        return mapper.readValue(json, Weather.class);

    }
}