package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        int numbers = 1;
        while (numbers <= 100) {
            System.out.println(numbers);
            if (numbers % 3 == 0 && numbers % 5 == 0) {
                System.out.println("FizzBuzz");
            } else {
                if (numbers % 3 == 0) {
                    System.out.println("Fizz");
                }
                if (numbers % 3 == 0) {
                    System.out.println("Buzz");
                }
            }
            numbers++;
        }
    }
}




