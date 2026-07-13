package com.chaithanya.skycast;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import com.chaithanya.skycast.api.WeatherApiClient;
import com.chaithanya.skycast.model.Weather;
import com.chaithanya.skycast.service.WeatherService;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        WeatherService service = new WeatherService();

        try {

            Weather weather = service.getWeather("Bangalore");

            System.out.println("City : " + weather.getName());

            System.out.println("Temperature : " + weather.getMain().getTemp());

            System.out.println("Humidity : " + weather.getMain().getHumidity());

            System.out.println("Wind Speed : " + weather.getWind().getSpeed());

            System.out.println("Description : "
                    + weather.getWeather().get(0).getDescription());

        } catch (Exception e) {
            e.printStackTrace();
        }

        Label label = new Label("Welcome to SkyCast Pro!");

        StackPane root = new StackPane(label);

        Scene scene = new Scene(root, 800, 600);

        stage.setTitle("SkyCast Pro");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}