package PracticeProblems.BinarySearch;

public class BS_03_EKO_EKO {
    public static void main(String[] args) {
        int[] arr = {16, 12, 8, 15};
        System.out.println(eko(arr, 10));
    }

    static int eko(int[] arr, int wood) {
        int ans = -1;
        int low = 0;
        int high = 0;
        for (int i = 0; i < arr.length; i++) {
            high = Math.max(high, arr[i]);
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, wood, mid)) {
                ans = mid;
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int wood, int mid) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mid)
                sum += arr[i] - mid;
        }
        return sum >= wood;
    }
}
