package com.company;

import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {
        HashMap<String , String > hmap = new HashMap<String,String>();
        hmap.put("978-1-60309-452-8","A Letter to Jo");
        hmap.put("978-1-60309-459-7","Lupus");
        hmap.put("978-1-60309-444-3","Red Panda and Moon Bear");
        hmap.put("978-1-60309-461-0","The Lab");

        for( Map.Entry elem : hmap.entrySet() )
        {
            System.out.println( elem.getValue()+" (ISBN: "+elem.getKey()+")" );
        }
        hmap.remove("978-1-60309-444-3");

        System.out.println(hmap);
        for( Map.Entry elem : hmap.entrySet() )
        {
            if (elem.getValue()=="The Lab") {
               hmap.remove(elem.getKey());
            }
        }
     









    }
}
