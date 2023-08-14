package com.example.design_pattern.section_12_composite_pattern.Duck;

import com.example.design_pattern.section_12_composite_pattern.Obsever.Observer;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑!");
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}