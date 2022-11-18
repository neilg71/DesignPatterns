package org.njg.designpatterns;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

class Journal{
    private final List<String> entries = new ArrayList<>();
    private static int count = 0;

    public void addEntry(String entry){
        entries.add(" " + (++count) + ": " + entry);
    }

    public void removeEntry(int index){
        entries.remove(index);
    }

    @Override
    public String toString() {
        return String.join(System.lineSeparator(),entries);
    }
}

class Main{
    public static void main(String[] args) {
        Journal journal = new Journal();
        journal.addEntry("something is under my bed");
        journal.addEntry("I found a body in my yard");
        journal.addEntry("who is on first?");
        System.out.println(journal);
    }
}