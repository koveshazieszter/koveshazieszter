package com.company;

public class CompareLength {
    public static void main(String[] args) {

        int[] firstArrayOfNumbers = {1, 2, 3};
        int firstLength = firstArrayOfNumbers.length;
        int[] secondArrayOfNumbers = {4, 5};
        int secondLength = secondArrayOfNumbers.length;

        if (secondLength > firstLength) {
            System.out.println("The secondArrayOfNumbers is longer!");
        }
    }
}
