package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

// Olvasd ki az összes adatot a 'log.txt' fájlból.
// Minden sor egy üzenetet jelöl egy webszervertől
// Írj egy föggvényt, ami visszaad egy tömböt az egyedi IP címekkel
// Írj egy függvényt, ami visszaadja a GET / POST kérések arányát
public class Log<array> {
    public static void main(String[] args) throws IOException {

      Path path = Paths.get("log.txt");
      ArrayList<String> linePrint = new ArrayList(Files.readAllLines(path));
      StringBuilder log = new StringBuilder();

      for (String Lline : linePrint) {
          log.append(Lline + "\n");
      }
        System.out.println(addressIP(log.toString()));
        System.out.println(requestGetPost(log.toString()));
    }
    static ArrayList<String> addressIP(String allDate) {
        String[] array = allDate.split(" ");
        StringBuilder ip = new StringBuilder();
        for (int i = 8; i < array.length; i += 12) {
            ip.append(array[i] + "\n");
        }
        ArrayList<String> lineIp = new ArrayList();
        lineIp.add(String.valueOf(ip));
        return lineIp;
    }
    static String requestGetPost(String allDate) {
        String[] array = allDate.split(" ");
        StringBuilder getPost = new StringBuilder();

        for (int i = 11; i < array.length; i += 12) {
            getPost.append(array[i] + "\n");
        }
        return getPost.toString();
    }


    // System.out.println(getPost.toString().split(" "));


}

