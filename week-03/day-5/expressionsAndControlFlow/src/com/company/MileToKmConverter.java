package com.company;

import java.util.Scanner;

public class MileToKmConverter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("How many miles did you go today?");
        double userMiles = scanner.nextDouble();
        double userKilometer = userMiles * 1.6;
        System.out.println("You have traveled miles in kilometers: " + userKilometer);


    }
}





