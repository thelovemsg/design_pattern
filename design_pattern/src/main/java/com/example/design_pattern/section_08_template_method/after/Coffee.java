package com.example.design_pattern.section_08_template_method.after;

public class Coffee implements CaffeineBeverage{
    @Override
    public void brew() {
        System.out.println("brewing coffee with filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk...");
    }
}
