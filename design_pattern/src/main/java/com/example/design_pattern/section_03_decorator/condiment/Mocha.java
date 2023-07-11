package com.example.design_pattern.section_03_decorator.condiment;

import com.example.design_pattern.section_03_decorator.Beverage;
import com.example.design_pattern.section_03_decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
