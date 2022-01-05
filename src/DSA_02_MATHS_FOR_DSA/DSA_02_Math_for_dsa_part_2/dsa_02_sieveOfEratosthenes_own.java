package DSA_02_MATHS_FOR_DSA.DSA_02_Math_for_dsa_part_2;

import java.util.Arrays;

public class dsa_02_sieveOfEratosthenes_own {
    public static void main(String[] args) {
        boolean[] arr = sieveOfEratosthenes(20);
        for (int i = 0; i < 20; i++) {
            System.out.println(i + " = " + arr[i]);
        }
    }

    static boolean[] sieveOfEratosthenes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }
}
