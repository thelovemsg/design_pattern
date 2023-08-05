package com.example.design_pattern.section_12_composite_pattern.Duck;

public class RubberDuck implements Quackable {
    @Override
    public void quack() {
        System.out.println("삑삑!");
    }
}