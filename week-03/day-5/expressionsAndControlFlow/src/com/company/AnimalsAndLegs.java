package com.company;

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
        System.out.println("How many hens are on the farm?");
    int hansOnTheFarm = scanner.nextInt();
        System.out.println("How many pigs are on the farm?");
    int pigsOnTheFarm = scanner.nextInt();
    int animalsLegsOnTheFarm = (hansOnTheFarm*2 + pigsOnTheFarm*4);
        System.out.println("That's the number of feet of your hens and pigs:" + animalsLegsOnTheFarm);



     }
}
