package com.sk101.observer;

public class Datasources extends Subject{
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyOberver();
    }
}
