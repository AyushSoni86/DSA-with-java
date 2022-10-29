package Lecture23_two_dimensional_Array;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

import java.util.*;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 5}, {4, 5, 6, 7}, {8, 7, 2, 6}, {6, 5, 3, 4}};
        printArray(arr);
        printSpiral(arr);
        System.out.println();
        List<Integer> ans = spiralOrder(arr);
        System.out.println(ans);
    }

    static void printSpiral(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;
        int total = row * col;
        int count = 0;

        while (count < total) {
            //printing start row
            for (int index = startCol; count < total && index <= endCol; index++) {
                System.out.print(arr[startRow][index] + "  ");
                count++;
            }
            startRow++;
            //printing end column
            for (int index = startRow; count < total && index <= endRow; index++) {
                System.out.print(arr[index][endCol] + "  ");
                count++;
            }
            endCol--;
            //printing end row
            for (int index = endCol; count < total && index >= startCol; index--) {
                System.out.print(arr[endRow][index] + "  ");
                count++;
            }
            endRow--;
            //printing start column
            for (int index = endRow; count < total && index >= startRow; index--) {
                System.out.print(arr[index][startCol] + "  ");
                count++;
            }
            startCol++;
        }
    }

    static List<Integer> spiralOrder(int[][] arr) {

        List<Integer> list = new ArrayList<>();

        int row = arr.length;
        int col = arr[0].length;

        int total = row * col;
        int count = 0;
        int startRow = 0;
        int endRow = row - 1;
        int startCol = 0;
        int endCol = col - 1;

        while (count < total) {

            // printing first row
            for (int i = startCol; count < total && i <= endCol; i++) {
                list.add(arr[startRow][i]);
                count++;
            }
            startRow++;

            // printing last Column
            for (int i = startRow; count < total && i <= endRow; i++) {
                list.add(arr[i][endCol]);
                count++;
            }
            endCol--;

            // printing last row
            for (int i = endCol; count < total && i >= startCol; i--) {
                list.add(arr[endRow][i]);
                count++;
            }
            endRow--;

            // printing first column
            for (int i = endRow; count < total && i >= startRow; i--) {
                list.add(arr[i][startCol]);
                count++;
            }
            startCol++;
        }
        return list;
    }
}
