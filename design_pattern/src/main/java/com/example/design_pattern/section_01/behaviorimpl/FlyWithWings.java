package com.example.design_pattern.section_01.behaviorimpl;

import com.example.design_pattern.section_01.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 잇어!");
    }
}
