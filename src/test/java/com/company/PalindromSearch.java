package com.company;


public class PalindromSearch {


    public static void main(String[] args) {
cd ..        searchPalindrom("madam");
    }

    static String searchPalindrom(String inputString) {

        String[] s1 = inputString.split(" ");
        System.out.println(s1.length);
        int palindromCounter = 0;
        char[] palindromList = new char[s1.length];
        char[] palindromNumbers = new char[palindromCounter];
          for (int i = 0; i < s1.length; i++) {
            String reverseString = String.valueOf(new StringBuilder(s1[i]).reverse());
            char reverseCharString[] = reverseString.toCharArray();
        }

        for (int i = 0; i < s1.length; i++) {
            String Stringstring = s1[i];
            char stringArray[] = Stringstring.toCharArray();
            String Array = String.valueOf(stringArray);
            String lenght = String.valueOf(Array.length());
            Array.length();




            if (stringArray.length < 3) {
                for (int j = 0; j < s1.length; j++) {
                    palindromCounter++;
                    palindromList[i] = stringArray[j];
                }
            }
        }
        String reversePalindromNumbers = String.valueOf(new StringBuilder(String.valueOf(palindromNumbers)).reverse());
        if (palindromNumbers.equals(reversePalindromNumbers)) {
            for (int j = 0; j < palindromCounter; j++) {

                palindromNumbers[j] = palindromList[j];
            }
        }
        return String.valueOf(palindromNumbers);
    }



}




