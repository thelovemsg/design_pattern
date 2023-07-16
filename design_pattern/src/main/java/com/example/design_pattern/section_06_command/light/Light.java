package com.example.design_pattern.section_06_command.light;

public class Light {
    String location;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light on!");
    }

    public void off() {
        System.out.println(location + " light off!");
    }
}