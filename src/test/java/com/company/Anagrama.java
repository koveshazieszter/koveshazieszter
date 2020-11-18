package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Anagrama {
    public static void main(String[] args) {

        System.out.println(isAnagram("dog", "god"));
    }
    static boolean isAnagram(String s1, String s2) {
        char firstString[] = s1.toCharArray();
        char secondString[] = s2.toCharArray();

        Arrays.sort(firstString);
        Arrays.sort(secondString);

        Boolean result = Arrays.equals(firstString,secondString);

      return result;

    }

}
