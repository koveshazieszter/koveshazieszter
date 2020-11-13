package com.company;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
        // a Világ helyett.
        // A program kérje a felhasználó nevétí
        Scanner scanner = new Scanner(System.in);
        System.out.println("Szia, hogy hívnak!");
        String userInput = scanner.nextLine();
        System.out.println("Hello, " + userInput + "!");
    }
}
