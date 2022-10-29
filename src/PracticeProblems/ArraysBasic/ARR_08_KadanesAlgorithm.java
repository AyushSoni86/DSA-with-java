package PracticeProblems.ArraysBasic;

public class ARR_08_KadanesAlgorithm {
    public static void main(String[] args) {
        int[] arr = {12, -23, 45, 67, -8, 1};
        System.out.println(kadanesAlgorithm(arr));
    }

    static int kadanesAlgorithm(int[] arr) {
        int currentSum = 0;
        int maxSum = 0;
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            if (currentSum > maxSum)
                maxSum = currentSum;
            if (currentSum < 0)
                currentSum = 0;
        }
        return maxSum;
    }
}
