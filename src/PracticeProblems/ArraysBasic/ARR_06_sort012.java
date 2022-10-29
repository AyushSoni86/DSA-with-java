package PracticeProblems.ArraysBasic;

import static PracticeProblems.ArraysBasic.ARR_01_ReverArray.printArray;

public class ARR_06_sort012 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,1,0,0,1,2,0,0,1,0,2,1,2};
        printArray(arr);
        sort012(arr);
        printArray(arr);
    }

    static void sort012(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int temp1 = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp1;
                    high--;

                    break;
            }
        }
    }
}
