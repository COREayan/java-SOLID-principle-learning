package com.ayan.dmitriNesteruk;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

class Journal {
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String text) {
        entries.add("" + (++count) + ": " + text);
    }

    public void removeEntry(int index) {
        entries.remove(index);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "entries=" + entries +
                '}';
    }

    public void save(String filename) throws FileNotFoundException {
        try (PrintStream out = new PrintStream(filename)) {
            out.println(toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void load(String filename) {}
//    public void load(URL url) {}
}

public class BadCode {
    public static void main(String[] args) throws Exception {
        Journal j = new Journal();
        j.addEntry("I cried today");
        j.addEntry("I ate a bug");
        System.out.println(j);
    }
}
