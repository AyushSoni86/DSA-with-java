package PracticeProblems.ArraysBasic;

import static PracticeProblems.ArraysBasic.ARR_01_ReverArray.printArray;

public class ARR_05_sort01 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0,0,0,1,0,1,1};
        printArray(arr);
        sort01(arr);
        printArray(arr);
    }


    static void sort01(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            while (arr[i] == 0) i++;
            while (arr[j] == 1) j--;
            if (arr[i] > arr[j] ) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
    }
}
