package com.chaithanya.skycast.api;

import com.chaithanya.skycast.config.AppConfig;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApiClient {

    private final HttpClient client = HttpClient.newHttpClient();

    public String getWeatherData(String city)
            throws IOException, InterruptedException {

        String url = AppConfig.BASE_URL
                + "?q=" + city
                + "&appid=" + AppConfig.API_KEY
                + "&units=metric";

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .GET()
                .build();

        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}