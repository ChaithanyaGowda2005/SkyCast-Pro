package com.chaithanya.skycast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {

    private String name;

    private MainInfo main;

    private Wind wind;

    private List<WeatherCondition> weather;

    private int visibility;

    private Sys sys;

    public Weather() {
    }

    public String getName() {
        return name;
    }

    public MainInfo getMain() {
        return main;
    }

    public Wind getWind() {
        return wind;
    }

    public List<WeatherCondition> getWeather() {
        return weather;
    }

    public int getVisibility() {
        return visibility;
    }

    public Sys getSys() {
        return sys;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public void setWeather(List<WeatherCondition> weather) {
        this.weather = weather;
    }

    public void setVisibility(int visibility) {
        this.visibility = visibility;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }
}