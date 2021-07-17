package com.sk101.visitor;

public class HightLightVisitor implements Visitor {
    @Override
    public void apply(HeadingNode node) {
        System.out.println("Highlight Heading");
    }

    @Override
    public void apply(AnchorNode node) {
        System.out.println("Highlight Anchor");

    }
}
