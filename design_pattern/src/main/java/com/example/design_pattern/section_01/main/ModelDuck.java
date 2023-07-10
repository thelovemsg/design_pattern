package com.example.design_pattern.section_01.main;

import com.example.design_pattern.section_01.behaviorimpl.FlyNoWay;
import com.example.design_pattern.section_01.behaviorimpl.Quack;

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
