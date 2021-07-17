package com.sk101.observer.pushstyleobserver;

import com.sk101.observer.pushstyleobserver.Chart;
import com.sk101.observer.pushstyleobserver.Datasource;
import com.sk101.observer.pushstyleobserver.SpreadSheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new Datasource();
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        dataSource.addOberver(sheet1);
        dataSource.addOberver(sheet2);
        dataSource.addOberver(chart);

        dataSource.setValue(1);
    }
}
