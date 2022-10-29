package Lecture23_two_dimensional_Array;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class BinarySearchIn2Darray_II {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30},
        };
        printArray(arr);
        System.out.println((binarySearch(arr, 233)) ? "Key found" : "key not found");
    }

    static boolean binarySearch(int[][] arr, int key) {
        int row = arr.length;
        int col = arr[0].length;

        int rowIndex = 0;
        int colIndex = col - 1;

        while (rowIndex < row && colIndex >= 0) {
            int element = arr[rowIndex][colIndex];
            if (element == key) {
                System.out.println(rowIndex + " " + colIndex);
                return true;
            }
            if (key > element)
                rowIndex++;
            else
                colIndex--;
        }


        return false;
    }
}
