package com.example.design_pattern.section_01.behaviorimpl;

import com.example.design_pattern.section_01.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑!");
    }
}
