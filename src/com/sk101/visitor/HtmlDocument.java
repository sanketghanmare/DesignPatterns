package com.sk101.visitor;

import java.util.ArrayList;
import java.util.List;

public class HtmlDocument {

    private final List<HtmlNode> nodes = new ArrayList<>();

    public void add(HtmlNode node) {
        nodes.add(node);
    }

    public void execute(Visitor visitor) {
        for (var node: nodes) {
            node.execute(visitor);
        }
    }
}
