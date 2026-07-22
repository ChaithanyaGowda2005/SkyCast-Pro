package com.chaithanya.skycast.controller;

import com.chaithanya.skycast.model.Weather;
import com.chaithanya.skycast.service.WeatherService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class WeatherController {

    @FXML
    private TextField cityField;

    @FXML
    private Label cityLabel;

    @FXML
    private Label temperatureLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label feelsLikeLabel;

    @FXML
    private Label humidityLabel;

    @FXML
    private Label windLabel;

    @FXML
    private Label pressureLabel;

    @FXML
    private Label visibilityLabel;

    @FXML
    private Label countryLabel;

    @FXML
    private Label sunriseLabel;

    @FXML
    private Label sunsetLabel;

    @FXML
    private ImageView weatherIcon;

    private final WeatherService weatherService = new WeatherService();

    @FXML
    public void initialize() {

        cityField.setText("Bengaluru");

        searchWeather();
    }

    @FXML
    public void searchWeather() {

        String city = cityField.getText().trim();

        if (city.isEmpty()) {

            cityLabel.setText("Please enter a city.");

            return;
        }

        try {

            Weather weather = weatherService.getWeather(city);

            cityLabel.setText(weather.getName() + ", " + weather.getSys().getCountry());

            temperatureLabel.setText(
                    String.format("%.1f °C",
                            weather.getMain().getTemp()));

            descriptionLabel.setText(
                    capitalize(weather.getWeather().get(0).getDescription()));

            feelsLikeLabel.setText(
                    String.format("%.1f °C",
                            weather.getMain().getFeelsLike()));

            humidityLabel.setText(
                    weather.getMain().getHumidity() + " %");

            windLabel.setText(
                    weather.getWind().getSpeed() + " m/s");

            pressureLabel.setText(
                    weather.getMain().getPressure() + " hPa");

            visibilityLabel.setText(
                    (weather.getVisibility() / 1000) + " km");

            countryLabel.setText(
                    weather.getSys().getCountry());

            sunriseLabel.setText(
                    formatTime(weather.getSys().getSunrise()));

            sunsetLabel.setText(
                    formatTime(weather.getSys().getSunset()));

            String iconCode =
                    weather.getWeather().get(0).getIcon();

            weatherIcon.setImage(
                    new Image(
                            "https://openweathermap.org/img/wn/"
                                    + iconCode
                                    + "@4x.png",
                            true));

        }

        catch (Exception e) {

            cityLabel.setText("City Not Found");

            temperatureLabel.setText("--");

            descriptionLabel.setText("--");

            feelsLikeLabel.setText("--");

            humidityLabel.setText("--");

            windLabel.setText("--");

            pressureLabel.setText("--");

            visibilityLabel.setText("--");

            countryLabel.setText("--");

            sunriseLabel.setText("--");

            sunsetLabel.setText("--");

            weatherIcon.setImage(null);

            e.printStackTrace();
        }

    }

    private String formatTime(long unixTime) {

        LocalDateTime time =
                LocalDateTime.ofInstant(
                        Instant.ofEpochSecond(unixTime),
                        ZoneId.systemDefault());

        return time.format(
                DateTimeFormatter.ofPattern("hh:mm a"));
    }

    private String capitalize(String text) {

        if (text == null || text.isEmpty())
            return "";

        return text.substring(0, 1).toUpperCase()
                + text.substring(1);
    }
}