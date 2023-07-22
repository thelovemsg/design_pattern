package com.example.design_pattern.section_08_template_method.before;

public class Coffee {
    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void boilWater() {
        System.out.println("boil water!");
    }

    private void brewCoffeeGrinds() {
        System.out.println("brewing coffee with filter");
    }

    private void pourInCup() {
        System.out.println("pouring coffee in cup");
    }

    private void addSugarAndMilk() {
        System.out.println("adding sugar and milk");
    }
}
