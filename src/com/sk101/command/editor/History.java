package com.sk101.command.editor;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class History {
    private final Deque<UnDoable> commands = new ArrayDeque<>();

    public void push(UnDoable command) {
        commands.add(command);
    }

    public UnDoable pop() {
        return commands.pop();
    }

    public int size() {
        return commands.size();
    }
}
