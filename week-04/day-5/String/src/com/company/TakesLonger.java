package com.company;

public class TakesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        String concat = ((quote.substring(0, 20) + " ").concat("always takes longer than")).concat(quote.substring(20));
        System.out.println(concat);


    }
}
