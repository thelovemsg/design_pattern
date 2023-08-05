package com.example.design_pattern.section_12_composite_pattern.Duck.facotry;

import com.example.design_pattern.section_12_composite_pattern.Duck.Quackable;

public interface AbstractDuckFactory {
    Quackable createMallardDuck();
    Quackable createRedheadDuck();
    Quackable createDuckCall();
    Quackable createRubberDuck();
    Quackable createGooseDuck();
}
