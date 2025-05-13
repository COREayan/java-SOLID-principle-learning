package com.ayan.prateekNarang.BadCode;

public class SimplePrinter implements Machine {
    @Override
    public void print(Document doc) {

    }

    @Override
    public void scan(Document doc) {
        throw new UnsupportedOperationException("Scan not supported.");
    }

    @Override
    public void copy(Document doc) {
        throw new UnsupportedOperationException("Copy not supported.");
    }
}
