package com.company;

public class TodoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";
        String todoList=todoText.concat(" - Download games\n\t - Diablo\n");
        System.out.println(todoList);
    }
}
