package DSA_06_ARRAYS_QUESTIONS;

public class KadanesAlgorithmReturningArray {
    public static void main(String[] args) {
        int[] arr = {21, 45, 23, -1, -34, 67, -23};
        int[] sub = maximumSubArray(arr);
        for (int i = 0; i < sub.length; i++) {
            System.out.println(sub[i]);
        }
    }

    static int[] maximumSubArray(int[] arr) {
        int[] subArray = new int[10];
        int maxSum = 0;
        int currentSum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                subArray[index] = arr[i];
                index++;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return subArray;
    }
}
