package com.example.design_pattern.section_01_strategy.behaviorimpl;

import com.example.design_pattern.section_01_strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
