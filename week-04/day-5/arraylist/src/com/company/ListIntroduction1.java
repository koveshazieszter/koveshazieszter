package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class ListIntroduction1 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        names.add("William");
        System.out.println(names.isEmpty());
        names.add("John");
        names.add("Amanda");
        System.out.println(names.get(2));

        for ( String name:names){
            System.out.println(name);
        }
        names.remove(1);
        Collections.reverse(names);

        for ( String name:names){

            System.out.println(name);
        }
        names.clear();




    }
}
