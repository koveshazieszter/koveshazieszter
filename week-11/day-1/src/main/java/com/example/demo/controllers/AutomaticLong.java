package com.example.demo.controllers;

public class AutomaticLong {
   private static int greetCount;

   public int getGreetCount() {
      greetCount++;
      return greetCount;
   }
}
