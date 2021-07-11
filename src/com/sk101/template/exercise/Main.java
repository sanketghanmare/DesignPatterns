package com.sk101.template.exercise;

public class Main {
    public static void main(String[] args) {
        var window1 = new ApplicationWindow();
        window1.close();
        System.out.println();
        var window2 = new BrowserWindow();
        window2.close();
    }
}
