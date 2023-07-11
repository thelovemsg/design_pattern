package com.example.design_pattern.section_01_strategy.main;

import com.example.design_pattern.section_01_strategy.behaviorimpl.FlyRockerPowered;

public class Simulator {
    public static void main(String[] args) {
        MallardDuck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        modelDuck.setFlyBehavior(new FlyRockerPowered());
        modelDuck.performFly();
    }
}
