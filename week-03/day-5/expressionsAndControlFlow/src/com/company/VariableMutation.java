package com.company;

public class VariableMutation {
    public static void main(String[] args){
        int a = 3;
        a += 10;
        System.out.println(a);

        int b = 100;
        b -= 7;
        System.out.println(b);

        int c = 44;
        c *= 2 ;
        System.out.println(c);

        int d = 125;
        d /= 5;
        System.out.println(d);

        int e = 8;
        e = (int)Math.pow(e,3);
        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        System.out.println(f1>f2?"nagyobb f2-nél": "nem nagyobb f2-nél");

        int g1 = 350;
        int g2 = 200;
        System.out.println(g2*2>g1?"g2 duplája nagyobb mint g1":"g2  duplája kissebb mint g1");


        int h = 135798745;
        boolean divisible = true;
        System.out.println(h % 11 ==0?"osztható":"nem osztható");


        int i1 = 10;
        int i2 = 3;
        System.out.println(i1>Math.pow(i2,2) && i1<Math.pow(i2,3)?"i1 nagyobb i2 négyzeténél és  kisebb i2 köbénél": "ez az állítás nem igaz");


        int j = 1521;
        // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
        System.out.println(j/3==0 || j/5==0);
    }
}
