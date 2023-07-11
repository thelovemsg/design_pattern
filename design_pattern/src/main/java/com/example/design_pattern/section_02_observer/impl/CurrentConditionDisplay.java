package com.example.design_pattern.section_02_observer.impl;

import com.example.design_pattern.section_02_observer.main.WeatherData;
import com.example.design_pattern.section_02_observer.behavior.DisplayElement;
import com.example.design_pattern.section_02_observer.behavior.Observer;

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
        this.humidity = weatherData.getHumidity();
        display();
    }
}
