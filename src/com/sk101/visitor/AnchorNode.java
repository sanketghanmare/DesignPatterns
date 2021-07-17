package com.sk101.visitor;

public class AnchorNode implements HtmlNode {

    @Override
    public void execute(Visitor concreteObject) {
        concreteObject.apply(this);
    }
}
