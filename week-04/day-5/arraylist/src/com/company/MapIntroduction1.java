package com.company;

import java.util.*;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        System.out.println(hmap.isEmpty());
        hmap.put(97, "a");
        hmap.put(98, "b");
        hmap.put(99, "c");
        hmap.put(65, "A");
        hmap.put(66, "B");
        hmap.put(67, "c");

        for (int key : hmap.keySet()) {
            System.out.println(key);
        }
        for (String value : hmap.values()) {

            System.out.println(value);
        }
        hmap.put(68, "D");
        int piece = 0;
        for (Map.Entry elem : hmap.entrySet()) {

            piece++;
        }
        System.out.println("key value pairs: " + piece);
        System.out.println(hmap.get(99));
        hmap.remove(97);
        System.out.println(hmap.containsKey(100));
        hmap.clear();
    }
}
