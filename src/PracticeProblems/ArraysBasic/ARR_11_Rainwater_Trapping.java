package PracticeProblems.ArraysBasic;

public class ARR_11_Rainwater_Trapping {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 0, 1, 3, 2};
        System.out.println(rainWater(arr));
        System.out.println(rainWater2(arr));
    }

    static int rainWater2(int[] arr) {
        int water = 0;
        int left = 0, right = arr.length - 1;
        int maxLeft = arr[left];
        int maxRight = arr[right];

        while (left < right) {
            if (arr[left] < arr[right]) {
                left++;
                maxLeft = Math.max(maxLeft, arr[left]);
                water += maxLeft - arr[left];
            } else {
                right--;
                maxRight = Math.max(maxRight, arr[right]);
                water += maxRight - arr[right];
            }
        }
        return water;
    }

    static int rainWater(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];

        left[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(left[i - 1], arr[i]);
        }

        right[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int water = 0;
        for (int i = 0; i < arr.length; i++) {
            water += Math.min(left[i], right[i]) - arr[i];
        }
        return water;
    }
}
