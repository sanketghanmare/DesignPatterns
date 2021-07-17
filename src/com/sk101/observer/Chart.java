package com.sk101.observer;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart got notified");
    }
}
