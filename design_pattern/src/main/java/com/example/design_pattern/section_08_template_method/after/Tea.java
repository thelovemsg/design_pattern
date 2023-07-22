package com.example.design_pattern.section_08_template_method.after;

public class Tea implements CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("steeping tea leaves...");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding lemon...");
    }
}
