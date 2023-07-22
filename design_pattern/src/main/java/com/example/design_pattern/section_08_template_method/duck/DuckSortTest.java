package com.example.design_pattern.section_08_template_method.duck;

import java.util.Arrays;

public class DuckSortTest {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("test1", 1),
            new Duck("test2", 8),
            new Duck("test3", 7),
            new Duck("test4", 6),
            new Duck("test5", 3)
        };

        System.out.println("정렬 전:\n");
        display(ducks);

        Arrays.sort(ducks);
        System.out.println("\n정렬 후:\n");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
