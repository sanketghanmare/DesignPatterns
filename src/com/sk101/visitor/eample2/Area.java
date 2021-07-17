package com.sk101.visitor.eample2;

import java.util.ArrayList;
import java.util.List;

public class Area {

    private final ArrayList<Shape> shapeList = new ArrayList ();

    public void AreaAdd(Shape s) {
        this.shapeList.add(s);
    }

    public void areaPrinter() {
        for (var s: shapeList) {
            s.getArea();
        }
    }

}
