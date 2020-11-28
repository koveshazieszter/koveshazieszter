package com.company;

public class Palindrom {
    public static void main(String[] args) {

        System.out.println(isPalindrom("hello"));
    }

    static String isPalindrom(String word) {

        String reverseString = String.valueOf(new StringBuilder(word).reverse());
        String result = " ";
        if (word.equals(reverseString)) {
            result = word;
            return result;

        } else {
            result = word.concat(reverseString);
            return result;
        }
    }
}

