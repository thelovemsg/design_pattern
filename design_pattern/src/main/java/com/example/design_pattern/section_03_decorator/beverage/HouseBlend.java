package com.example.design_pattern.section_03_decorator.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블랜드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }

}
