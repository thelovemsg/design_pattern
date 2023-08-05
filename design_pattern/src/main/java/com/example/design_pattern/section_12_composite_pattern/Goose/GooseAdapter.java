package com.example.design_pattern.section_12_composite_pattern.Goose;

import com.example.design_pattern.section_12_composite_pattern.Duck.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }
}
