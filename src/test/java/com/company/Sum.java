package com.company;

public class Sum {
    public static void main(String[] args) {
        int sumOfnNumbers = 5;
        System.out.println(sum(sumOfnNumbers));
    }
    static int sum( int sumOfNumbers){
        int i;
        int sum=0;
        for (i=0; sumOfNumbers > i; i++) {
            sum+= i;
        }
        sumOfNumbers=sum;
        return sumOfNumbers;
    }

// - Hozz létre egy class-t `Sum` névvel és benne a main függvényt.
// - Készíts egy függvényt `sum` névvel mely összeadja a számokat
//   nullától a bemeneti paraméterig és visszaadja azok összegét.



}
