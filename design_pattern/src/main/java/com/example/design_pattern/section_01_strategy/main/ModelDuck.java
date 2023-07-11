package com.example.design_pattern.section_01_strategy.main;

import com.example.design_pattern.section_01_strategy.behaviorimpl.FlyNoWay;
import com.example.design_pattern.section_01_strategy.behaviorimpl.Quack;

public class ModelDuck extends Duck{

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다.");
    }

}
