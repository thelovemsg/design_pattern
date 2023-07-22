package com.example.design_pattern.section_04_factory.abstract_factory.clam;

import com.example.design_pattern.section_04_factory.abstract_factory.Pizza;
import com.example.design_pattern.section_04_factory.abstract_factory.factories.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing ... " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        clam = ingredientFactory.createClams();
    }
}
