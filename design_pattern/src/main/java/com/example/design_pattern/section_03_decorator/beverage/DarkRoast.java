package com.example.design_pattern.section_03_decorator.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "다크로스트입니다.";
    }

    @Override
    public double cost() {
        return 1.5;
    }

}
