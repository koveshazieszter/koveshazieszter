package com.company;

import java.util.Arrays;

public class SubInt {


        public static void main(String args[]) {

            int digit = 5;
            int[] array = new int[] { 5, 12, 123, 325, 23};
            System.out.println(Arrays.toString(subInt(digit, array)));
        }

        private static int[] subInt(int digit, int[] array) {
            int[] matches = new int[array.length];

            // this will be the size of the array to return
            int numberOfMatches = 0;

            // filling the matches array
            for (int i = 0; i < array.length; i++) {
                // checking if there is a matched digit at index i
                boolean hasMatchedDigit = false;
                String s = String.valueOf(array[i]);
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    int cAsDigit = Character.getNumericValue(c);
                    if (digit == cAsDigit) {
                        hasMatchedDigit = true;
                        break;
                    }
                }

                // if there is a matched digit, we append to the matched array and increase number of matches
                if (hasMatchedDigit) {
                    matches[numberOfMatches] = i;
                    numberOfMatches++;
                }
            }

            // create a new array which has only the required length;
            int[] result = new int[numberOfMatches];
            for (int i = 0; i < numberOfMatches; i++) {
                result[i] = matches[i];
            }

            return result;
        }
    }

