package com.company;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 11, 34, 11, 52, 61, 1, 34};
        System.out.println(Arrays.toString(unique(numbers)));
    }
    static int[] unique(int[] numbers) {
        int numberOfUniqeElements = 0;
        int[] uniqueElements = new int[numbers.length];
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length-1; i++) {
            if (numbers[i + 1] != numbers[i]) {
                uniqueElements[numberOfUniqeElements] = numbers[i];
                numberOfUniqeElements++;
            }
        }
        if(numbers[numbers.length - 1] != numbers[numbers.length - 2])
        {
            uniqueElements[numberOfUniqeElements]= numbers[numbers.length - 1];
            numberOfUniqeElements++;
        }
        int[] result = new int[numberOfUniqeElements];
        for (int i = 0; i < numberOfUniqeElements; i++) {

            result[i] = uniqueElements[i];
        }
        return result;
    }
}



