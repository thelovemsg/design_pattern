package com.example.design_pattern.section_09_iterator_visitor.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu{

    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();

        addItem("K&B Pancake Set",
                "Pancake with scrambled egg and toast",
                false,
                2.99);

        addItem("Regular Pancake Set",
                "Pancake with fried egg and sausage",
                false,
                2.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return (ArrayList<MenuItem>) menuItems;
    }

    public Iterator<MenuItem> createIterator() {
        return menuItems.iterator();
    }
}
