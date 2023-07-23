package com.example.design_pattern.section_09_iterator_visitor.iterator;

import java.util.Iterator;
import java.util.List;

public class PancakeHouseIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems;
    int position = 0;

    public PancakeHouseIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public boolean hasNext() {
        // or shorten to:
        return menuItems.size() > position;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("메뉴 항목은 지우면 안된다람쥐");
    }
}
