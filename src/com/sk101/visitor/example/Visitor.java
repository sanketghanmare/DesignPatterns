package com.sk101.visitor.example;

public interface Visitor {
    void accept(FactSegment fact);
    void accept(FormatSegment format);

}
