package PracticeProblems;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        print(arr);
        rotate(arr,4);
        print(arr);
    }

    static void print(int[] arr) {
        for (int n : arr)
            System.out.print(n + " ");
        System.out.println();
    }

    static void rotate(int[] arr, int k) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[(i + k) % arr.length] = arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }
}
