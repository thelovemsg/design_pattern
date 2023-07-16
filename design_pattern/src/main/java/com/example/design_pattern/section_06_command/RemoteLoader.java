package com.example.design_pattern.section_06_command;

import com.example.design_pattern.section_06_command.garage.GarageDoor;
import com.example.design_pattern.section_06_command.light.Light;
import com.example.design_pattern.section_06_command.light.LightOffCommand;
import com.example.design_pattern.section_06_command.light.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kichenLight = new Light("Kichen");
        GarageDoor garage = new GarageDoor("Garage");

        remoteControl.setCommand(0,
                new LightOnCommand(livingRoomLight),
                new LightOffCommand(livingRoomLight));

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
    }
}
