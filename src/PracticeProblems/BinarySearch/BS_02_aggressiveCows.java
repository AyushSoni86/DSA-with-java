package PracticeProblems.BinarySearch;

import java.util.Arrays;

public class BS_02_aggressiveCows {
    public static void main(String[] args) {

    }

    static int aggressiveCows(int[] arr, int cows) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr[arr.length - 1];
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, cows, mid)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int cows, int mid) {
        int cowsCount = 1;
        int lastPos = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - lastPos >= mid) {
                cowsCount++;
                if (cows == cowsCount) return true;
                lastPos = arr[i];
            }
        }
        return false;
    }
}
