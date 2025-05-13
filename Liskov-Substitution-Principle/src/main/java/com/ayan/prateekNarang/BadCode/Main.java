package com.ayan.prateekNarang.BadCode;

public class Main {
    public static void main(String[] args) {
        File file = new ReadOnlyFile();
        file.read();
        file.write(); // throwing an exception, violation of LSP
    }
}
