package Lecture24_Math_for_DSA;

public class CatalanNumbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++)
            System.out.print(catalanNumber(i) + " ");
    }


    static long factorial(int n) {
        long res = 1;
        for (int i = 1; i <= n; i++)
            res *= i;
        return res;
    }

    static long catalanNumber(int n) {
        // 2n!/(n+1)!n!
        //  1, 1, 2, 5, 14, 42, 132, 429, 1430, 4862, …
        long numerator = factorial(2 * n);
        long denominator = factorial(n + 1);
        long denominator2 = denominator * factorial(n);
        return numerator / denominator2;
    }
}
