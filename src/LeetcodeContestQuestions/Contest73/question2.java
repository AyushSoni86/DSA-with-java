package LeetcodeContestQuestions.Contest73;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        int[] map = {8, 9, 4, 0, 2, 1, 3, 5, 7, 6};
        int[] arr = {991, 338, 38};
        System.out.println(Arrays.toString(arr));
        mapping(arr, map);
    }

    static void mapping(int[] arr, int[] map) {
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int res = 0;
            int j = 0;
            while (num != 0) {

                int digit = num % 10;
                res = res + map[digit] * (int) Math.pow(10, j++);
                num = num / 10;
            }
            ans[i] = res;
        }
        System.out.println("printing answer array");
        System.out.println(Arrays.toString(ans));
        sortHashMap(arr,ans);
//
//        HashMap<Integer, Integer> mapp = new HashMap<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            mapp.put(ans[i], arr[i]);
//        }
////        System.out.println(map);
//        // sorting the hashmap
//        ArrayList<Integer> sortedKeys
//                = new ArrayList<>(mapp.keySet());
//
//        Collections.sort(sortedKeys);
//
//        // Display the TreeMap which is naturally sorted
//        int[] finalArr = new int[arr.length];
//        int k = 0;
//        System.out.println("printng the key pair valuies");
//        for (int x : sortedKeys){
//            System.out.println( mapp.get(x));
//        }
//        System.out.println(Arrays.toString(finalArr));
    }

    static void sortHashMap(int[] arr, int[] ans) {
        HashMap<Integer, Integer> mapp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            mapp.put(arr[i], ans[i]);
        }
        ArrayList<Integer> sortedKeys = new ArrayList<>(mapp.keySet());
        Collections.sort(sortedKeys);
        int[] finalArr = new int[arr.length];
        System.out.println("printng the key pair valuies");
        for (int x : sortedKeys) {
            System.out.println(mapp.get(x));
        }
        System.out.println(Arrays.toString(finalArr));

        // using keySet() for iteration over keys
        for (int name : mapp.keySet())
            System.out.println("key: " + name);

        // using values() for iteration over values
        for (int url : mapp.values())
            System.out.println("value: " + url);
    }
}