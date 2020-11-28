package com.company;

public class AppendAFunc {
    public static void main(String[] args) {
        String typo = "Chinchill";
        appendAFunc(typo);
    }

    static void appendAFunc(String typo) {
        typo += "a";
        System.out.println(typo);
    }
}
