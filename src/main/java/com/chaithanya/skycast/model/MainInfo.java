package com.chaithanya.skycast.model;

public class MainInfo {

    private double temp;

    private double feels_like;

    private int humidity;

    private int pressure;

    public MainInfo() {
    }

    public double getTemp() {
        return temp;
    }

    public double getFeels_like() {
        return feels_like;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public void setFeels_like(double feels_like) {
        this.feels_like = feels_like;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
}