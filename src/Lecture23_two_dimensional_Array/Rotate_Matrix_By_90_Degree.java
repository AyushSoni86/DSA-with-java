package Lecture23_two_dimensional_Array;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class Rotate_Matrix_By_90_Degree {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {4, 5, 6, 8}, {7, 8, 9, 10}, {11, 12, 13, 14}};
        printArray(arr);
        transpose(arr);
        System.out.println("Transpose of matrix ");
        printArray(arr);
        reverse(arr);
        System.out.println("Matrix rotated successfully");
        printArray(arr);
    }

    static void transpose(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < row; col++) {
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
    }

    static void reverse(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length/2; col++) {
                int temp = arr[row][arr.length - 1-col];
                arr[row][arr.length - 1-col] = arr[row][col];
                arr[row][col] = temp;
            }
        }
    }

}
