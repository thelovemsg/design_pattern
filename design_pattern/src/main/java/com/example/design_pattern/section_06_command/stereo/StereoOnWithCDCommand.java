package com.example.design_pattern.section_06_command.stereo;

import com.example.design_pattern.section_06_command.Command;

public class StereoOnWithCDCommand implements Command {

    Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
        stereo.setCD();
        stereo.setVolume(0);
    }
}
