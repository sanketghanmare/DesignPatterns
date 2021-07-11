package com.sk101.state;

public class EraseTool implements Tool{

    @Override
    public void mouseDown() {
        System.out.println("Eraser Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Erasing...");
    }

}
