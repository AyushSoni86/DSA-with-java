package PracticeProblems.ArraysBasic;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ARR_04_IntersectionOfArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {5, 6, 7};
        System.out.println(intersection(arr1, arr2));
    }

    static ArrayList<Integer> intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                ans.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] > arr2[j])
                j++;
            else i++;
        }

        return ans;
    }
}
