package com.example.design_pattern.section_03_decorator;

import com.example.design_pattern.section_03_decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    protected Beverage beverage;
    public abstract String getDescription();
}
