package com.example.design_pattern.section_10_status_pattern.gumballstate;

import java.io.Serializable;

public interface State extends Serializable {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
    void refill();
}
