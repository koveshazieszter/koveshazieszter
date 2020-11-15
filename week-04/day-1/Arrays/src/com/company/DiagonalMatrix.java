package com.company;

public class DiagonalMatrix {
    public static void main(String[] args) {

         int arrayLength=4;
         int[][] array =  new int[arrayLength][arrayLength];
         for(int i =0; i<arrayLength; i++){
             for(int j =0; j<arrayLength; j++){
                 if (j==i){
                     array[i][j]=1;
                 }
                 System.out.print(array[i][j] + " ");

             }
             System.out.println();
         }
    }
}
