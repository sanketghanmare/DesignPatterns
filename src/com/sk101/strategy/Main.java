package com.sk101.strategy;

public class Main {
    public static void main(String[] args) {
        var imageSTore = new ImageStore();
        imageSTore.store("a",new JPEGCompressor(), new BlackAndWhiteFilter());
        System.out.println();
        imageSTore.store("b",new PNGCompressor(), new BlackAndWhiteFilter());

    }
}
