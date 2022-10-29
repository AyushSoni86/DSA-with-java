package DSA_07_SORTING_ALGORITHMS;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {23, 45, 23, 78, 6, 3, 78, 63, 33, 6, 100, 56, 0};
        printArray(arr);
        bubbleSort(arr);
        printArray(arr);
    }

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length -1- i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
