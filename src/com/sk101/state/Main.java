package com.sk101.state;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new EraseTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
