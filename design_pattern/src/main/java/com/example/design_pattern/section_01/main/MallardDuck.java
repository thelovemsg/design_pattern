package com.example.design_pattern.section_01.main;

import com.example.design_pattern.section_01.behaviorimpl.FlyWithWings;
import com.example.design_pattern.section_01.behaviorimpl.Quack;

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
