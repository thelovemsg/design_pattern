package com.example.design_pattern.section_03_decorator.beverage;

import com.example.design_pattern.section_03_decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
