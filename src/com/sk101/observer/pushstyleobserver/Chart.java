package com.sk101.observer.pushstyleobserver;

public class Chart implements Observer{
    @Override
    public void update(int val) {
        System.out.println("The Chart value: " + val);
    }
}
