package com.example.design_pattern.section_12_composite_pattern.Duck.facotry;

import com.example.design_pattern.section_12_composite_pattern.Duck.*;
import com.example.design_pattern.section_12_composite_pattern.Goose.Goose;
import com.example.design_pattern.section_12_composite_pattern.Goose.GooseAdapter;

public class CountingDuckFactory implements AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedheadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

    @Override
    public Quackable createGooseDuck() {
        return new GooseAdapter(new Goose());
    }
}
