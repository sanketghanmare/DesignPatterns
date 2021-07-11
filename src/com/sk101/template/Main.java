package com.sk101.template;

public class Main {
    public static void main(String[] args) {
       var task = new TransferMoneyTask();
       task.execute();
        System.out.println();
        var task2 = new GenerateReportTask();
        task2.execute();
    }
}
