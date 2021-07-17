package com.sk101.visitor;

public class PlainTextVisitor implements Visitor{
    @Override
    public void apply(HeadingNode node) {
        System.out.println("text-heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("text-anchor");
    }
}
