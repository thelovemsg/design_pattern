package com.example.design_pattern.section_01_strategy.behaviorimpl;

import com.example.design_pattern.section_01_strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 잇어!");
    }
}
