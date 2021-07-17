package com.sk101.visitor.eample2;

public class Main {
    public static void main(String[] args) {
        var area = new Area();
        area.AreaAdd(new Circle());
        area.AreaAdd(new triangle());
        area.AreaAdd(new Square());

        area.areaPrinter();
    }
}
