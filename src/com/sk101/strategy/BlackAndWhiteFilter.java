package com.sk101.strategy;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String filterName) {
        System.out.println("Applying BG filter");
    }
}
