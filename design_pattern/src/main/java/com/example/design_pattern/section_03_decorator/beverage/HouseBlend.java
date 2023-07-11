package com.example.design_pattern.section_03_decorator.beverage;

import com.example.design_pattern.section_03_decorator.Beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "하우스 블랜드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }

}
