package com.example.design_pattern.section_04_factory.factory_method.store;

import com.example.design_pattern.section_04_factory.factory_method.pizza.NYStyleCheesePizza;
import com.example.design_pattern.section_04_factory.factory_method.pizza.Pizza;

public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String item) {
        if (item.equals("cheese")){
            return new NYStyleCheesePizza();
        }

        return null;
    }
}
