package com.company;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class DivideByZero {


// Készíts egy függvényt, ami kap egy számot,
// majd elosztja ezzel a számmal a tízet és
// kiírja az eredményt.
// Ha a bemeneti paraméter 0, azt írja ki, hogy 'hiba'


    public static void main(String[] argcds) {

        // write your code here
        dividedByNumber(0);
    }

    static int dividedByNumber(int number) throws NullPointerException {
        int result = 0;
        try {
            result = 10 / number;

            if (number != 0) {
                System.out.println(result);
            }
        } catch (ArithmeticException e) {
            System.out.println("fault!");
        }
        return result;

    }
}
