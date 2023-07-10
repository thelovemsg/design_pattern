package com.example.design_pattern.section_01.behaviorimpl;

import com.example.design_pattern.section_01.behavior.FlyBehavior;

public class FlyRockerPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("로켓 추친으로 날아갑니다.");
    }
}
