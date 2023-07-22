package com.example.design_pattern.section_08_template_method.hook;

public class HookTest {
    public static void main(String[] args) {
        var coffeeWithHook = new CoffeeWithHook();
        System.out.println("Preparing coffee...");
        coffeeWithHook.prepareRecipe();
    }
}