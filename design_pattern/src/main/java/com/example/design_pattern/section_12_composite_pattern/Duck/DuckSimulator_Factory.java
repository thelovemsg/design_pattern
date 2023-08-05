package com.example.design_pattern.section_12_composite_pattern.Duck;

import com.example.design_pattern.section_12_composite_pattern.Duck.facotry.AbstractDuckFactory;
import com.example.design_pattern.section_12_composite_pattern.Duck.facotry.CountingDuckFactory;

public class DuckSimulator_Factory {
    public static void main(String[] args) {
        DuckSimulator_Factory simulator = new DuckSimulator_Factory();
        CountingDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    private void simulate(CountingDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = duckFactory.createGooseDuck();

        System.out.println("\n오리 시뮬레이션 게임 (+추상 팩토리)");

        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);

        System.out.println("오리가 소리 낸 횟수 : " + QuackCounter.getQuacks() + " 번");
    }

    void simulate(Quackable duck){
        duck.quack();
    }

}
