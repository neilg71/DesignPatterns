package com.example.journal;

import java.util.ArrayList;
import java.util.List;

public class Journal{
    private List<String> entries = new ArrayList<>();
    private static int ndx=0;

    public void setEntry(String text){
        entries.add("entry" + ++ndx + ": " + text);
    }

    public String getEntry(int ndx){
        return entries.get(ndx);
    }

    public String toString(){
        return String.join(System.lineSeparator(),entries);
    }

}


class JournalApplication {

    public static void main(String[] args){
        Journal j = new Journal();

        j.setEntry("today I cried");
        j.setEntry("then I ate a bug");
        System.out.println(j);

    }

}
