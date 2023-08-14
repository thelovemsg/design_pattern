package com.example.design_pattern.section_12_composite_pattern.Duck.facotry;

import com.example.design_pattern.section_12_composite_pattern.Duck.*;

import java.lang.management.RuntimeMXBean;

public class DuckFactory implements AbstractDuckFactory{
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }

    @Override
    public Quackable createGooseDuck() {
        return null;
    }
}
