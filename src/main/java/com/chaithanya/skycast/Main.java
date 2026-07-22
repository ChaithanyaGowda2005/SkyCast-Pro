package com.chaithanya.skycast;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/view/weather.fxml")
        );

        Scene scene = new Scene(loader.load(), 1280, 720);

        stage.setMinWidth(1280);
        stage.setMinHeight(720);
        stage.setResizable(false);

        stage.setTitle("SkyCast Pro");

        stage.setScene(scene);

        stage.setResizable(false);

        stage.centerOnScreen();

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}