package com.company;

public class SwapElements {
    public static void main(String[] args) {
        String[] temporary = {""};
        String[] orders = {"first", "second", "third"};
        temporary[0] = orders[0];
        orders[0] = orders[2];
        orders[2]=temporary[0];
        for (int i = 0 ; i < orders.length; i++){
            System.out.println(orders[i]);
        }







    }
}
