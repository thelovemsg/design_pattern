package com.example.design_pattern.section_10_status_pattern.gumballstate;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
