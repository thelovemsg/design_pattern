package com.example.design_pattern.section_04_factory.factory_method.store;

import com.example.design_pattern.section_04_factory.factory_method.pizza.ChicagoStyleCheesePizza;
import com.example.design_pattern.section_04_factory.factory_method.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new ChicagoStyleCheesePizza();
		}

		return null;
	}
}
