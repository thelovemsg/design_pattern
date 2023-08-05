package com.example.design_pattern.section_12_composite_pattern;

import com.example.design_pattern.section_12_composite_pattern.Duck.*;
import com.example.design_pattern.section_12_composite_pattern.Goose.Goose;
import com.example.design_pattern.section_12_composite_pattern.Goose.GooseAdapter;

public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();
    }

    private void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable redheadDuck = new RedheadDuck();
        Quackable duckCall = new DuckCall();
        Quackable rubberDuck = new RubberDuck();
        GooseAdapter gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리게임 시뮬레이션");
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
    }

    void simulate(Quackable duck){
        duck.quack();
    }
}
