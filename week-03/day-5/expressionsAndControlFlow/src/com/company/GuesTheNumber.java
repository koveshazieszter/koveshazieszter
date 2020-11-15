package com.company;

import java.util.Scanner;
// Írj egy programot ami tárol egy számot és
// a felhasználónak kell kitalálnia azt.
// A felhasználó találgathat és
// minden standard input-ba beírt szám után
// a programnak ki kell írnia egyet ezek közül:
//
// A tárolt szám nagyobb
// A tárolt szám kisebb
// Eltaláltad a számot

public class GuesTheNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int computerNumber = 5;
        int userMatch;

        int i = 0;
        do {
            System.out.println("Guess, what i was thinking!");
            userMatch = scanner.nextInt();
            if (userMatch < computerNumber) {
                System.out.println("The stored number is larger!");
            } else if (userMatch > computerNumber) {
                System.out.println("The stored number is smaller!");
            }
            i++;
        }
        while (userMatch!=computerNumber);
        System.out.println("You guessed the number!");
    }


}
