package com.example.design_pattern.section_09_iterator_visitor.iterator;

import java.util.Iterator;

public interface Menu {
    Iterator<MenuItem> createIterator();
}
