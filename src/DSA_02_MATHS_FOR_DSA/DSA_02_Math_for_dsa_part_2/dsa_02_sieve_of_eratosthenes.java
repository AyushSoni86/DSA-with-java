package DSA_02_MATHS_FOR_DSA.DSA_02_Math_for_dsa_part_2;

import java.util.Arrays;

public class dsa_02_sieve_of_eratosthenes {
    public static void main(String[] args) {
        int range = 34;
        boolean[] arr = sieveOfEratosthenes(range);
//        for (int i = 0; i < range; i++) {
//            System.out.println(i + " = " + arr[i]);
//        }

        for (int i = 0; i < range; i++) {
            System.out.print((arr[i]) ? i + " " : "");
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
