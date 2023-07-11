package com.example.design_pattern.section_01_strategy.main;

import com.example.design_pattern.section_01_strategy.behaviorimpl.FlyWithWings;
import com.example.design_pattern.section_01_strategy.behaviorimpl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("나는 물회오리 오리입니다 꽥!");
    }
}
