package com.sk101.visitor;

public interface HtmlNode {
    void execute(Visitor concreteObject);
}
