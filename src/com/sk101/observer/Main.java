package com.sk101.observer;

public class Main {
    public static void main(String[] args) {
        var dataSource = new Datasources();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addOberver(sheet1);
        dataSource.addOberver(sheet2);
        dataSource.addOberver(chart);

        dataSource.setValue(1);
    }
}
