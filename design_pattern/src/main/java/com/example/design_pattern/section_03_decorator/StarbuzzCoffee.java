package com.example.design_pattern.section_03_decorator;

import com.example.design_pattern.section_03_decorator.beverage.DarkRoast;
import com.example.design_pattern.section_03_decorator.beverage.Espresso;
import com.example.design_pattern.section_03_decorator.condiment.Mocha;

public class StarbuzzCoffee {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);

        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
