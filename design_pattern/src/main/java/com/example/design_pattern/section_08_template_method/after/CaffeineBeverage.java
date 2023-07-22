package com.example.design_pattern.section_08_template_method.after;

public interface CaffeineBeverage {
    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    void brew();
    void addCondiments();

    default void boilWater() {
        System.out.println("boiling water...");
    }
    default void pourInCup(){
        System.out.println("pouring in cup...");
    }
}
