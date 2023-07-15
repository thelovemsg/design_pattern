package com.example.design_pattern.section_04_factory.abstract_factory.store;

import com.example.design_pattern.section_04_factory.abstract_factory.Pizza;
import com.example.design_pattern.section_04_factory.abstract_factory.cheese.CheesePizza;
import com.example.design_pattern.section_04_factory.abstract_factory.clam.ClamPizza;
import com.example.design_pattern.section_04_factory.abstract_factory.factories.NYPizzaIngredientFactory;
import com.example.design_pattern.section_04_factory.abstract_factory.pepperoni.PepperoniPizza;
import com.example.design_pattern.section_04_factory.abstract_factory.veggies.VeggiePizza;

public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
        } else if (item.equals("veggie")) {
            pizza = new PepperoniPizza(ingredientFactory);
        }
        return null;
    }
}
