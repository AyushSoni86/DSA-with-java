package Lecture24_Math_for_DSA;

import java.util.Arrays;

public class Sieve_Of_Eratosthenes {
    public static void main(String[] args) {
        System.out.println(countPrimes(10));
    }

    static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        int cnt = 0;
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            for (int j = 2 * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        for (int i = 0; i < isPrime.length; i++) {
            if (isPrime[i]) cnt++;
        }
        return cnt;
    }
}
