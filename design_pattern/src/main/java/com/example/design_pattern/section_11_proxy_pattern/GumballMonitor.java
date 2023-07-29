package com.example.design_pattern.section_11_proxy_pattern;

public class GumballMonitor {
    GumballMachine gumballMachine;

    public GumballMonitor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    public void report() {
        System.out.println("뽑기 기계 위치: " + gumballMachine.getLocation());
        System.out.println("현재 재고: " + gumballMachine.getCount() + "개");
        System.out.println("현재 상태: " + gumballMachine.getState());
    }
}
