package com.company;

public class Factorio {
    public static void main(String[] args) {
        int inputValue = 6;
        System.out.println(factorio(inputValue));
    }

    static int factorio(int inputValue) {
        int i;
        for (i = 1; i <= inputValue; i++) {
            i *= i;
        }
        return inputValue = i;
    }
}
