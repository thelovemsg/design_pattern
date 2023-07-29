package com.example.design_pattern.section_10_status_pattern.gumballstate;

public class WinnerState implements State {
    GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

	public void insertQuarter() {
		System.out.println("error");
	}

	public void ejectQuarter() {
		System.out.println("error");
	}

	public void turnCrank() {
		System.out.println("error");
	}

	public void dispense() {
		gumballMachine.releaseBall();
		if (gumballMachine.getCount() == 0) {
			gumballMachine.setState(gumballMachine.getSoldOutState());
		} else {
			gumballMachine.releaseBall();
			System.out.println("축하드립니다! 알맹리를 하나 더 받으실 수 있습니다!");
			if (gumballMachine.getCount() > 0) {
				gumballMachine.setState(gumballMachine.getNoQuarterState());
			} else {
				System.out.println("더이상 알맹이가 없습니다.");
				gumballMachine.setState(gumballMachine.getSoldOutState());
			}
		}
	}

	public void refill() { }

	public String toString() {
		return "waiting for quarter";
	}
}
