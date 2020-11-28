package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;

public class Births {
    // Készíts egy függvényt, ami
//  - bemeneten kap egy CSV fájlnevet,
//    - minden sor a következő formátumban:
//      <személy neve>;születési idő YYYY-MM-DD formátumban;<város neve>
//  - visszaadja az évszámot, amikor a legtöbben születtek.

    // Találsz egy ilyen fájlt az 'assets' mappában 'births.csv' néven.
// Ha beadod a 'births.csv'-t a függvényednek, az eredmény vagy 2006
// vagy 2016 kéne, hogy legyen.
    public static void main(String[] args) {
        System.out.println(dateBirths("births.csv"));
    }

    static String dateBirths(String input) {
        Path path = Paths.get(input);
        ArrayList<String> lines = null;
        try {
            lines = new ArrayList<>(Files.readAllLines(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        HashMap<String, Integer> puffer = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (String line : lines) {
            String date = line.split(";")[1];
            String year = date.substring(0, 4);

            if (puffer.containsKey(year)) {
                puffer.put(year, puffer.get(year) + 1);
            } else {
                puffer.put(year, 1);
            }
        }
        String maxKey= "";
        for (String key : puffer.keySet()) {
            if (puffer.get(key).compareTo(max) > 0) {
                max = puffer.get(key);
                maxKey= key;
            }
        }

        return maxKey;
    }
}
