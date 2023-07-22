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
            pizza.setName("NewYork style cheese pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName("NewYork style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName("NewYork style Clam Pizza");
        } else if (item.equals("veggie")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("NewYork style Peperoni Pizza");
        } else{
            System.out.println("nothing included!");
        }
        return pizza;
    }
}
