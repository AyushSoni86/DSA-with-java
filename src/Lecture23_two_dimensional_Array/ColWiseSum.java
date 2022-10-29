package Lecture23_two_dimensional_Array;

public class ColWiseSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,5},{4,5,6,7},{8,7,2,6},{6,5,3,4}};
        printArray(arr);
        colSum(arr);
    }

    static void printArray(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
    }

    static void colSum(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[j][i];
            }
            System.out.print(sum + "  ");
        }

    }
}
