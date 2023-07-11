package com.example.design_pattern.section_02_observer.impl;

import com.example.design_pattern.section_02_observer.behavior.DisplayElement;
import com.example.design_pattern.section_02_observer.behavior.Observer;
import com.example.design_pattern.section_02_observer.main.WeatherData;

import java.util.ArrayList;
import java.util.List;

public class StatisticsDisplay implements Observer, DisplayElement {

    private WeatherData weatherData;

    private List<Float> averageTemps = new ArrayList<>();
    private float maximumTemp;
    private float minimumTemp;

    public StatisticsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("평균/최고/최저 온도 = " +
                                getAverageTemp() + " / " +
                                maximumTemp + " / " +
                                minimumTemp);
    }

    private float getAverageTemp() {
        return averageTemps.stream().reduce((float) 0,(a, b) -> a+b) / averageTemps.size();
    }

    @Override
    public void update() {
        float temperature = weatherData.getTemperature();
        this.averageTemps.add(temperature);
        if(temperature > maximumTemp)
            this.maximumTemp = temperature;
        if(Float.compare(minimumTemp, 0) == 0)
            this.minimumTemp = temperature;
        if(temperature < minimumTemp)
            this.minimumTemp = temperature;
        display();
    }

}
