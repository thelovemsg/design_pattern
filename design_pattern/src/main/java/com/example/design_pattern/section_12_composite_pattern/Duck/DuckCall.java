package com.example.design_pattern.section_12_composite_pattern.Duck;

public class DuckCall implements Quackable {
    @Override
    public void quack() {
        System.out.println("꽉꽉!");
    }
}