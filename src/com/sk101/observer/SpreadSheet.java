package com.sk101.observer;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spredsheet got notified");
    }
}
