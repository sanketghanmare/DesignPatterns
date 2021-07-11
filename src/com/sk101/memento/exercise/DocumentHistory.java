package com.sk101.memento.exercise;

import java.util.ArrayDeque;
import java.util.Deque;

public class DocumentHistory {

    private final Deque<DocumentState> docState = new ArrayDeque<>();

    public void push(DocumentState state) {
        docState.add(state);
    }

    public DocumentState pop() {
        return docState.pop();
    }

}
