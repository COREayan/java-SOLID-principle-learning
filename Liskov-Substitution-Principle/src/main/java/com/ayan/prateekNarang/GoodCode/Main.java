package com.ayan.prateekNarang.GoodCode;

public class Main {
    public static void main(String[] args) {
        ReadableFile readableFile = new ReadOnlyFile();
        readableFile.read();

        WritableFile writableFile = new WritableFile();
        writableFile.read();
        writableFile.write();
    }
}
