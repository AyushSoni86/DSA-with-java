package Lecture23_two_dimensional_Array;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class WavePrintArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{4,5,6,7},{8,7,2,6},{6,5,3,4}};
        printArray(arr);
        System.out.println("Wave printing the array");
        wavePrint(arr);
    }

    static void wavePrint(int[][] arr){

        for (int row = 0; row < arr.length; row++) {
            if ((row & 1) ==0) {
                for (int col = 0; col < arr[row].length; col++)
                    System.out.print(arr[col][row] + "  ");
            }else{
                for (int col = arr[row].length - 1; col >= 0; col--)
                    System.out.print(arr[col][row] + "  ");
            }
            System.out.println();
        }
    }
}
