package com.company;

public class Reverse {
    public static void main(String[] args) {
        String toBeReversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
        int i = toBeReversed.length()-1;
        while (i > 0){
            char reverse = toBeReversed.charAt(i);
            System.out.print(reverse);
            i--;
        }
    }
}
