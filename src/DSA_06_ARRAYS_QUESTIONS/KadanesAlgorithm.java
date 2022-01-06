package DSA_06_ARRAYS_QUESTIONS;

public class KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {21, 45, 23, -1, -34, 67, -23};
        System.out.println(maximumSubArray(arr));
    }

    static int maximumSubArray(int[] arr) {
        int maxSum = 0;
        int currentSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }
        }
        return maxSum;
    }
}
