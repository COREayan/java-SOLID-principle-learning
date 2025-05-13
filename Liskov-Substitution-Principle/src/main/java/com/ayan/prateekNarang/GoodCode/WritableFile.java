package com.ayan.prateekNarang.GoodCode;

public class WritableFile extends ReadableFile implements Writable {
    @Override
    public void write() {
        System.out.println("Writing to a file ...");
    }
}
