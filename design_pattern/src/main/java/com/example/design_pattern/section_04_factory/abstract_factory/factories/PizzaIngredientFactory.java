package com.example.design_pattern.section_04_factory.abstract_factory.factories;

import com.example.design_pattern.section_04_factory.abstract_factory.cheese.Cheese;
import com.example.design_pattern.section_04_factory.abstract_factory.clam.Clams;
import com.example.design_pattern.section_04_factory.abstract_factory.dough.Dough;
import com.example.design_pattern.section_04_factory.abstract_factory.pepperoni.Pepperoni;
import com.example.design_pattern.section_04_factory.abstract_factory.veggies.Sauce;
import com.example.design_pattern.section_04_factory.abstract_factory.veggies.Veggies;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
