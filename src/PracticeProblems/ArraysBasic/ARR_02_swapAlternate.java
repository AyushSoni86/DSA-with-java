package PracticeProblems.ArraysBasic;

import static PracticeProblems.ArraysBasic.ARR_01_ReverArray.printArray;

public class ARR_02_swapAlternate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        printArray(arr);
        swapAlternate(arr);
        printArray(arr);
    }

    static void swapAlternate(int[] arr){
        for (int i = 0; i < arr.length; i+=2) {
            if ((i+1) < arr.length){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1]= temp;
            }
        }
    }
}
