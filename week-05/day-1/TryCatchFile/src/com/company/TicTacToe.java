package com.company;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TicTacToe {


    public static void main(String[] args) {
        tickTack("win-o.txt");
        tickTack("win-x.txt");
        tickTack("draw.txt");
    }

    static String tickTack(String pathPlace) {
        Path path = Paths.get(pathPlace);
        char[][] array = new char[3][3];
        try {
            ArrayList<String> arrayTickTack = new ArrayList(Files.readAllLines(path));
            int j = 0;
            for (String line : arrayTickTack) {
                char[] currentArray = new char[3];
                currentArray = line.toCharArray();
                for (int i = 0; i < currentArray.length; i++) {
                    array[j][i] = currentArray[i];
                }
                j++;
            }
            if ((array[0][0] == 'X' && array[0][1] == 'X' && array[0][2] == 'X') ||
                (array[1][0] == 'X' && array[1][1] == 'X' && array[1][2] == 'X') ||
                (array[2][0] == 'X' && array[2][1] == 'X' && array[2][2] == 'X') ||
                (array[0][0] == 'X' && array[1][1] == 'X' && array[2][2] == 'X') ||
                (array[0][2] == 'X' && array[1][1] == 'X' && array[2][0] == 'X')) {
                System.out.println("X");
            }
          else  if ((array[0][0] == 'O' && array[0][1] == 'O' && array[0][2] == 'O') ||
                (array[1][0] == 'O' && array[1][1] == 'O' && array[1][2] == 'O') ||
                (array[2][0] == 'O' && array[2][1] == 'O' && array[2][2] == 'O') ||
                (array[0][0] == 'O' && array[1][1] == 'O' && array[2][2] == 'O') ||
                (array[0][2] == 'O' && array[1][1] == 'O' && array[2][0] == 'O')) {
                System.out.println("O");
            }
           else if ((array[0][0] == 'X' && array[1][0] == 'X' && array[2][0] == 'X') ||
                (array[0][1] == 'X' && array[1][1] == 'X' && array[2][1] == 'X') ||
                (array[0][2] == 'X' && array[1][2] == 'X' && array[2][2] == 'X')) {
                System.out.println("X");
            }
           else if((array[0][0] == 'O' && array[1][0] == 'O' && array[2][0]=='O')||
               (array[0][1] == 'O' && array[1][1] == 'O' && array[2][1]=='O')||
               (array[0][2] == 'O' && array[1][2] == 'O' && array[2][2]=='O')){
                System.out.println("O");
            }else {
                System.out.println("Draw");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return String.valueOf(array);
    }
}
