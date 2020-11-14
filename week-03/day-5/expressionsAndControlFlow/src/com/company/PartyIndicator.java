package com.company;

import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many girls come to the party?");
        int numberOfGirlsAtTheParty = scanner.nextInt();
        System.out.println("How many boys come to the party?");
        int numberOfBoysAtTheParty = scanner.nextInt();
        int numberOfPeople = numberOfBoysAtTheParty + numberOfGirlsAtTheParty;
        if (numberOfPeople > 20 && numberOfBoysAtTheParty == numberOfGirlsAtTheParty) {
            System.out.println("This party is excellent!");
        }
        if (numberOfPeople > 20 && numberOfBoysAtTheParty != numberOfGirlsAtTheParty) {
            System.out.println("This party is quite good!");
        }
        if (numberOfPeople < 20) {
            System.out.println("The party is average!");
        }
        if (numberOfGirlsAtTheParty == 0) {
            System.out.println("Superpower party!");
        }
    }
}
