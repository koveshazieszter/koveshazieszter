package com.company;

import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Please, enter a  first number!");
        int number1 = scanner.nextInt();
        System.out.println("Please, enter a  second number!");
        int number2 = scanner.nextInt();
        if(number2<=number1){
            System.out.println("The second number should be bigger!");
        }
        else if(number2>number1){
           int i = number1;
            while(i<number2){
                i++;
                System.out.println(i);
            }
        }


    }
}
