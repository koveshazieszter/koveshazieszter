package com.company;

public class SumAll {
    public static void main(String[] args) {
// - Készíts egy `numbers` nevű változót (tömböt)
//   a következő tartalommal (értékekkel): `[3, 4, 5, 6, 7]`
// - Írasd ki a konzolra a `numbers` tömb összes elemének összegét
        int sum = 0;
        int[] numbers = {3, 4, 5, 6, 7};
        for (int i = 0; i < numbers.length ; i++){
            sum += numbers[i];

        }
        System.out.println(sum);
    }
}
