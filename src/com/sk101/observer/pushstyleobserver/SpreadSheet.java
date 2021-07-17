package com.sk101.observer.pushstyleobserver;

public class SpreadSheet implements Observer{
    @Override
    public void update(int val) {
        System.out.println("The Spreadsheet value: " + val);
    }
}
