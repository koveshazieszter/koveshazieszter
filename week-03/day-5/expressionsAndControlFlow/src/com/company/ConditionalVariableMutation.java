package com.company;

public class ConditionalVariableMutation {

    public static void main(String[] args) {
        double a = 24;
        int out = 0;
        if (a % 2 == 0) {
            out++;
        }
        System.out.println(out);
        System.out.println(" ");
        int b = 13;
        String out2 = "";
        if (b>=10 && b<=20){
            out2="Édes!";
        }
        else if  (b<10){
            out2="Kevés!";
        }
        else if  (b>20){
            out2="Sok!";
        }
        System.out.println(out2);
        System.out.println(" ");
        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        if (credits >= 50 && !isBonus){
            c-=2;
        }
        if(credits<50 && !isBonus) {
            c = c - 1;
        }
        System.out.println(c);
        System.out.println(" ");
        int d = 8;
        int time = 120;
        String out3 = "";
        if (d%4==0 && time<=200){
            out3 ="check";
        }
        else if (time>200) {
            out3 = "Time's up!";
        }else{
            out3="Run, Foreast, run!";
        }
        System.out.println(out3);
    }
}

