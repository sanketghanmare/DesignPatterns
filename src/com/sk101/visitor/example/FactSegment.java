package com.sk101.visitor.example;

public class FactSegment implements Segment {
    @Override
    public void execute(Visitor concreteObject) {
        concreteObject.accept(this);
    }
}
