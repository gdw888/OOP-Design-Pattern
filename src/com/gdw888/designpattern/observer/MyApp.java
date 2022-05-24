package com.gdw888.designpattern.observer;

public class MyApp {
    public static void main(String args[]){
        WeatherData weatherData = new WeatherData();
        Display1 display1 = new Display1(weatherData);
        Display2 display2 = new Display2(weatherData);

        weatherData.setData(0);
        weatherData.setData(2);
    }
}
