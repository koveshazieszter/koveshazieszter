package com.company;

public class AppendA {
    public static void main(String[] args) {
     //   - Készíts egy `animals` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `["koal", "pand", "zebr"]`
// - Minden elemhez csatolj egy "a" betűt a szó végére
        String[] animals = {"koal", "pand", "zebr"};
        int i;
        String plusA=" ";
        for (i = 0; i < animals.length; i++){
            plusA = animals[i] + "a";
            System.out.print(plusA + ", ");
        }


    }
}
