package com.example.design_pattern.section_06_command.garage;

public class GarageDoor {

    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    void up() {
        System.out.println("door up!");
    }

    void down() {
        System.out.println("door down!");
    }

    void stop() {
        System.out.println("door stop!");
    }
}
