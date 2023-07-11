package com.example.design_pattern.section_01_strategy.behaviorimpl;

import com.example.design_pattern.section_01_strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 못날아요~!");
    }
}
