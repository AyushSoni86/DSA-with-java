package Lecture23_two_dimensional_Array;


import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class Multiplication_Of_Matrix {
    public static void main(String[] args) {

        int arr1[][] = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        int arr2[][] = {{1, 1, 1, 1}, {2, 2, 2, 2}, {3, 3, 3, 3}};

        // creating a third matrix to store the multiplication value
        int[][] ans = new int[arr1.length][arr2[0].length];

        System.out.println("printing first matrix");
        printArray(arr1);

        System.out.println("printing second matrix");
        printArray(arr2);

        // calling the method for multiplication of matrix
        multiplication(arr1, arr2, ans);

        System.out.println("printing multiplication matrix");
        printArray(ans);
    }

    static void multiplication(int[][] arr1, int[][] arr2, int[][] ans) {
        for (int row = 0; row < arr1.length; row++) {
            for (int col = 0; col < arr2[0].length; col++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    ans[row][col] += arr1[row][k] * arr2[k][col];
                }
            }
        }
    }
}
