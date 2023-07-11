package com.example.design_pattern.section_02_observer.behavior;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();
}
