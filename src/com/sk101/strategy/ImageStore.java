package com.sk101.strategy;

public class ImageStore {

    public void store(String filename, Compressor jpegCompressor, Filter blackAndWhiteFilter) {
        jpegCompressor.compress(filename);
        blackAndWhiteFilter.apply(filename);
    }
}
