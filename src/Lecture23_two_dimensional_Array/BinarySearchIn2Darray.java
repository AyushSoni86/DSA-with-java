package Lecture23_two_dimensional_Array;

import static Lecture23_two_dimensional_Array.LagestRowSum.printArray;

public class BinarySearchIn2Darray {
    public static void main(String[] args) {
//        int[][] arr = {{1, 2, 3, 5}, {7, 9, 10, 17}, {28, 37, 42, 46}, {56, 65, 73, 74}};
        int[][] arr = {{1}};
        printArray(arr);
        System.out.println(binarySearch(arr,1));
    }


    static int binarySearch(int[][] arr, int key) {
        int i = arr.length;
        int j = arr[0].length;

        int low = 0;
        int high = i * j;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int row = mid / j, col = mid % j;

            int element = arr[row][col];
            if (key == element) {
                System.out.println("Element is present at index "+ row + ", "+ col +" in the matrix");
                return 1;
            }
            if (key > element)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return 0;
    }
}
