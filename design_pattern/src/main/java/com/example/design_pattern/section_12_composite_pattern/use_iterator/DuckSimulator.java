package com.example.design_pattern.section_12_composite_pattern.use_iterator;


import com.example.design_pattern.section_12_composite_pattern.Duck.Quackable;
import com.example.design_pattern.section_12_composite_pattern.Duck.facotry.AbstractDuckFactory;
import com.example.design_pattern.section_12_composite_pattern.Duck.facotry.CountingDuckFactory;
import com.example.design_pattern.section_12_composite_pattern.Flock;
import com.example.design_pattern.section_12_composite_pattern.Goose.Goose;
import com.example.design_pattern.section_12_composite_pattern.Goose.GooseAdapter;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        simulator.simulate(duckFactory);
    }

    public void simulate(AbstractDuckFactory duckFactory) {
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\n오리 시뮬레이션 게임: 무리(+컴포지트)");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);


    }


}
