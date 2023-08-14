package com.example.design_pattern.section_12_composite_pattern.Goose;

import com.example.design_pattern.section_12_composite_pattern.Duck.Quackable;
import com.example.design_pattern.section_12_composite_pattern.Obsever.Observer;

public class GooseAdapter implements Quackable {
    Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

    @Override
    public void registerObserver(Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }
}
