package com.example.design_pattern.section_04_factory.abstract_factory.cheese;

import com.example.design_pattern.section_04_factory.abstract_factory.Pizza;
import com.example.design_pattern.section_04_factory.abstract_factory.factories.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing ... : " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClams();
    }
}
