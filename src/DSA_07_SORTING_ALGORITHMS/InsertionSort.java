package DSA_07_SORTING_ALGORITHMS;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {7, 12, 3, 4, 1 };
//        int arr[] = {23, 45, 23, 78, 6, 3, 78, 63, 33, 6, 100, 56, 0};
        printArray(arr);
        insertionSort(arr);
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    static void insertionSort(int[] arr) {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            System.out.println("pass number : " + i);
            printArray(arr);
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr);
            }
            arr[j + 1] = key;
        }


    }
}
