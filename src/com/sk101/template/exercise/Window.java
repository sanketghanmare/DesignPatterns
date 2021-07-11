package com.sk101.template.exercise;

public abstract class Window {
    public void close() {
        doExecute();
    }

    protected abstract void doExecute();
}
