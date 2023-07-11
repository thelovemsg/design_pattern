package com.example.design_pattern.section_01_strategy.behaviorimpl;

import com.example.design_pattern.section_01_strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< 조용 >>");
    }
}
