package com.example.design_pattern.section_06_command.fan;

import com.example.design_pattern.section_06_command.Command;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
        System.out.println("set fan speed to off");
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH)
            ceilingFan.high();
        else if (prevSpeed == CeilingFan.MEDIUM)
            ceilingFan.medium();
        else if (prevSpeed == CeilingFan.LOW)
            ceilingFan.low();
        else if (prevSpeed == CeilingFan.OFF)
            ceilingFan.off();
    }
}
