package com.sk101.observer.pushstyleobserver;
import java.util.ArrayList;
import java.util.List;

public class Subject {

    private final List<Observer> observers = new ArrayList<>();

    public void addOberver(Observer observer) {
        observers.add(observer);
    }

    public void removeOberver(Observer observer) {
        observers.remove(observer);

    }

    public void notifyOberver(int value) {
        for (var observer:observers) {
            observer.update(value);
        }
    }
}
