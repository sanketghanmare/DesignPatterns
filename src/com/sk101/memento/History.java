package com.sk101.memento;

import java.util.ArrayList;
import java.util.List;

public class History {

    private final List<EditorState> editorStates = new ArrayList<>();

    public void push(EditorState state) {
        editorStates.add(state);
    }

    public EditorState pop() {
        var lastIndex = editorStates.size() - 1;
        var lastState = editorStates.get(lastIndex);
        editorStates.remove(lastState);
        return lastState;
    }
}
