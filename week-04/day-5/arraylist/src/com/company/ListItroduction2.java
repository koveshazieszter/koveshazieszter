package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class ListItroduction2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<>((Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee")));
        ArrayList<String> listB = new ArrayList<>();
        listB.addAll(listA);
        System.out.println(listB);
        System.out.println(listA.contains("Durian"));
        listB.remove(3);
        System.out.println(listB);
        listA.add(4, "Kivifruit");
        System.out.println(listA);
        System.out.println(listA.equals(listB));
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        String words = "Passion Fruit, Pomelo";
        String[] wordTwo = words.split(", ");
        listB.addAll(Arrays.asList(wordTwo));

        int piece = 0;
        for (String name : listA) {

            if (piece < 3) {
                System.out.print(name + ", ");
            }
            piece++;
        }


    }
}
