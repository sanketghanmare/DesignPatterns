package com.sk101.state;

public class SelectionTool  implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Seletion Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw Dashed Rectangle");
    }
}
