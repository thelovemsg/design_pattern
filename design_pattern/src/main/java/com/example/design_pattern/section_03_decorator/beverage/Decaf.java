package com.example.design_pattern.section_03_decorator.beverage;

import com.example.design_pattern.section_03_decorator.Beverage;

public class Decaf extends Beverage {

    public Decaf() {
        description = "디카페인입니다.";
    }

    @Override
    public double cost() {
        return .3;
    }
}
