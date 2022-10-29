package Lecture23_two_dimensional_Array;

public class Lecture23_two_dimensionalArray {
    public static void main(String[] args) {
//        int[][] arr = new int[row][col];
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(arr.length);
//        System.out.println(arr.length);

        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr.length; col++) {
                sum += arr[row][col];
            }
            System.out.println(sum);

        }


    }


}
