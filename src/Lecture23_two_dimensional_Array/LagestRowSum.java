package Lecture23_two_dimensional_Array;

public class LagestRowSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,30},{4,5,6,7},{8,3,7,2,6}};
        printArray(arr);
        int maxIndex = lasrgestRowSum(arr);
        System.out.println(maxIndex);
    }


    static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static int lasrgestRowSum(int[][] arr) {
        int rowIndex = -1;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                rowIndex = i;
            }
        }
        System.out.println(maxSum);
        return rowIndex;
    }
}
