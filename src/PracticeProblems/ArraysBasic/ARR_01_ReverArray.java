package PracticeProblems.ArraysBasic;

public class ARR_01_ReverArray {
    public static void main(String[] args) {
        int[] arr = {8,2,5,7,4,7,6};
        printArray(arr);
        reverse(arr);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - 1 - i] = temp;
        }
    }
}
