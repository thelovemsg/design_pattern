package com.example.design_pattern.section_06_command.light;

import com.example.design_pattern.section_06_command.Command;

//Command
public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
