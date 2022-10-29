package Lecture24_Math_for_DSA;

import java.util.ArrayList;

public class Segmentation_sieve {
    public static void main(String[] args) {
        segmentedSieveAlgo(30, 100);
    }

    static void segmentedSieveAlgo(int a, int b) {

        // creating square root of upper range that is 'b'
        int rootb = (int) Math.sqrt(b);

        // getting all the primes till square root of upper bound that is 'b'
        ArrayList<Integer> primes = sieve(rootb);


        boolean[] arr = new boolean[b - a + 1];   // false -> prime & true -> not prime

        // marking using prime
        for (int prime : primes) {
            // finding the starting index for marking
            int multiple = (int) Math.ceil((a * 1.0) / prime);
            if (multiple == 1) multiple++;

            int startIndex = multiple * prime - a;
            for (int j = startIndex; j < arr.length; j += prime) {
                arr[j] = true; // making the multiples not prime
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (!arr[i] && i + a != 1) {
                System.out.print((i + a) + "  ");
            }

        }
    }

    static ArrayList<Integer> sieve(int num) {
        boolean[] arr = new boolean[num + 1];   // false -> prime & true -> not prime

        for (int i = 2; i * i <= arr.length; i++) {
            if (!arr[i]) {
                for (int j = 2 * i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 2; i < arr.length; i++) {
            if (!arr[i])
                res.add(i);
        }
        return res;
    }
}
