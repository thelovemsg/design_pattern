package com.example.design_pattern.section_08_template_method.hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook implements CaffeineBeverageWithHook{

    @Override
    public void brew() {
        System.out.println("Brewing coffee with filter...");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }

    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")){
            return true;
        }

        return false;
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like to add sugar and milk in coffee? - (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch(IOException ioe){
            System.out.println("IO error!");
        }

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
