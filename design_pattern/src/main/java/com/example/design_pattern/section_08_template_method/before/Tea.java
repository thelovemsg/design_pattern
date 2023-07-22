package com.example.design_pattern.section_08_template_method.before;

public class Tea {
    void prepareRecipe() {
        boilWater();
        steepTeabag();
        pourInCup();
        addLemon();
    }

    private void boilWater() {
        System.out.println("boil water!");
    }

    private void steepTeabag() {
        System.out.println("brewing tea leaves");
    }

    private void pourInCup() {
        System.out.println("pouring coffee in cup");
    }

    private void addLemon() {
        System.out.println("adding lemon");
    }
}
