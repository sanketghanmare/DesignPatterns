package com.sk101.visitor;

public interface Visitor {
    void apply(HeadingNode node);
    void apply(AnchorNode node);
}
