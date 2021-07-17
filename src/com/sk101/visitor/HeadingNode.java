package com.sk101.visitor;

public class HeadingNode implements HtmlNode {

    @Override
    public void execute(Visitor concreteObject) {
        concreteObject.apply(this);
    }
}
