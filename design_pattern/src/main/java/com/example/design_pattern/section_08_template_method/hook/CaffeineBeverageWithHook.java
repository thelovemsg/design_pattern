package com.example.design_pattern.section_08_template_method.hook;

public interface CaffeineBeverageWithHook {
    default void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    void brew();
    void addCondiments();

    default void boilWater() {
        System.out.println("boiling water...");
    }
    default void pourInCup(){
        System.out.println("pouring in cup...");
    }

    default boolean customerWantsCondiments() {
        return true;
    }
}
