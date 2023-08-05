package com.example.design_pattern.section_12_composite_pattern.Duck;

import com.example.design_pattern.section_12_composite_pattern.Obsever.QuackObservable;

public interface Quackable extends QuackObservable {
    void quack();
}
