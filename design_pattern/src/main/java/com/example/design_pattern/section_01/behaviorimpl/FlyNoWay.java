package com.example.design_pattern.section_01.behaviorimpl;

import com.example.design_pattern.section_01.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("나는 못날아요~!");
    }
}
