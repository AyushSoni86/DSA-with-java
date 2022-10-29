package PracticeProblems;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 1, 0, 2, 4, 0, 0, 3, 4, 5, 3, 4, 3, 9, 0, 0, 9, 3, 8, 0, 3};
        printArray(arr);
        moveZeroes(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    static void moveZeroes(int[] arr) {
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                k++;
            }
        }
    }
}
