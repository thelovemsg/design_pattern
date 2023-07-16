package com.example.design_pattern.section_06_command;

//Invoker
public class SimpleRemoteControl {
    Command command;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }
}
