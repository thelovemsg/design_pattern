package com.example.design_pattern.section_04_factory.abstract_factory.factories;

import com.example.design_pattern.section_04_factory.abstract_factory.cheese.Cheese;
import com.example.design_pattern.section_04_factory.abstract_factory.cheese.MarinaraSauce;
import com.example.design_pattern.section_04_factory.abstract_factory.cheese.ReggianoCheese;
import com.example.design_pattern.section_04_factory.abstract_factory.clam.Clams;
import com.example.design_pattern.section_04_factory.abstract_factory.clam.FreshClams;
import com.example.design_pattern.section_04_factory.abstract_factory.dough.Dough;
import com.example.design_pattern.section_04_factory.abstract_factory.dough.ThinCrustDough;
import com.example.design_pattern.section_04_factory.abstract_factory.pepperoni.Pepperoni;
import com.example.design_pattern.section_04_factory.abstract_factory.pepperoni.SlicedPepperoni;
import com.example.design_pattern.section_04_factory.abstract_factory.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
