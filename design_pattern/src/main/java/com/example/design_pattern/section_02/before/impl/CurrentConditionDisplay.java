package com.example.design_pattern.section_02.before.impl;

import com.example.design_pattern.section_02.before.main.WeatherData;
import com.example.design_pattern.section_02.before.behavior.DisplayElement;
import com.example.design_pattern.section_02.before.behavior.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("현재 상태 : 온도 " + temperature + "F, 습도 " + humidity + "%");
    }

    @Override
    public void update() {
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity()
        ;
        display();
    }
}
