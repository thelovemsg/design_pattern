package com.example.design_pattern.section_03_decorator;

public abstract class Beverage {
    protected String description = "제목 없음";
    public String getDescription() {
        return description;
    }
    public abstract double cost();
}
