package com.example.design_pattern.section_01_strategy.behaviorimpl;

import com.example.design_pattern.section_01_strategy.behavior.FlyBehavior;

public class FlyRockerPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추친으로 날아갑니다.");
    }
}
