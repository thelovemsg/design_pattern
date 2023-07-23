package com.example.design_pattern.section_09_iterator_visitor.iterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CafeMenu implements Menu{
    Map<String, MenuItem> menuItems = new HashMap<>();

    public CafeMenu() {
        addItem("test1", "test1 description", true, 3.99);
        addItem("test2", "test2 description", false, 4.11);
        addItem("test3", "test3 description", true, 4.33);
    }

    private void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(name, menuItem);
    }

//    public Map<String, MenuItem> getMenuItem() {
//        return menuItems;
//    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menuItems.values().iterator();
    }
}
