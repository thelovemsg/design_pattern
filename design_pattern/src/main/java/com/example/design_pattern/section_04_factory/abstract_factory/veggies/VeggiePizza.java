package com.example.design_pattern.section_04_factory.abstract_factory.veggies;

import com.example.design_pattern.section_04_factory.abstract_factory.Pizza;
import com.example.design_pattern.section_04_factory.abstract_factory.factories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
	PizzaIngredientFactory ingredientFactory;
 
	public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
 
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		cheese = ingredientFactory.createCheese();
		veggies = ingredientFactory.createVeggies();
	}
}
