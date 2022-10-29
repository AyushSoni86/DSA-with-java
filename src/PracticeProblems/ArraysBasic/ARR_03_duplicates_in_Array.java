package PracticeProblems.ArraysBasic;

import java.util.ArrayList;

public class ARR_03_duplicates_in_Array {
    public static void main(String[] args) {
        // case 1 - only one duplicate
        int[] arr = {1, 2, 2, 3, 4, 5, 6};
        System.out.println(duplicate(arr));

        // case 2 - duplicates more than 1
        int[] arr1 = {4, 3, 2, 7, 8, 2, 3, 1};
        ArrayList<Integer> ans = allDuplicates(arr);
        System.out.println(ans );
    }

    static int duplicate(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            ans = ans ^ arr[i] ^ i;
        }
        return ans;
    }

    static ArrayList<Integer> allDuplicates(int[] arr) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int n : arr) {
            n = Math.abs(n);
            if (arr[n - 1] > 0)
                arr[n - 1] *= -1;
            else
                ans.add(arr[n]);
        }
        return ans;
    }
}
