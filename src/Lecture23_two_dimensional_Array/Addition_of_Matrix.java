package Lecture23_two_dimensional_Array;

import java.util.Arrays;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class Addition_of_Matrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3, 4}, {4, 5, 6, 8}, {7, 8, 9, 10}, {11, 12, 13, 14}};
        int[][] arr2 = {{11, 7, 4, 1}, {12, 8, 5, 2}, {13, 9, 6, 3}, {14, 10, 8, 4}};
        int[][] ans = matrixAddition(arr1,arr2);
//        System.out.println(Arrays.deepToString(ans));
        printArray(ans);
    }

    static int[][] matrixAddition(int[][] arr1, int[][] arr2) {
        int[][] ans = new int[arr1.length][arr2.length];
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            for (int row = 0; row < arr1.length; row++) {
                for (int col = 0; col < arr1.length; col++) {
                    ans[row][col] = arr1[row][col] + arr2[row][col];
                }
            }
        }
        return ans;
    }

}
