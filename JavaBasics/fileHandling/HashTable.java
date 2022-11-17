package com.syntax.JavaBasics.fileHandling;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        Map<String, Integer>hasTable = new Hashtable<>();//thread safe and will not allow null values
        hasTable.put("puskar",111);
        hasTable.put("oscar",222);
        hasTable.put("sarah",333);
        hasTable.put("danish",444);
        hasTable.put("jack",555);
        hasTable.put("jason",666);
        //note: because of thread sleep it is slower and not allowed null value..it is used less compare to Map
    }
}
