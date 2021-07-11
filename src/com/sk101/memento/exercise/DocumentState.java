package com.sk101.memento.exercise;

public class DocumentState {
    private final String content;
    private final float size;
    private final String name;

    public DocumentState(String content, String name, float size) {
        this.content = content;
        this.name = name;
        this.size = size;
    }

    public String getContent() {
        return content;
    }

    public float getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
