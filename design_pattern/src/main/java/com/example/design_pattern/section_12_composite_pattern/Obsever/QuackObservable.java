package com.example.design_pattern.section_12_composite_pattern.Obsever;

public interface QuackObservable {
    void registerObserver(Observer observer);
    void notifyObservers();
}
