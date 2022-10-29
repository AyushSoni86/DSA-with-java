package Lecture24_Math_for_DSA;

public class FastPower {
    public static void main(String[] args) {
        System.out.println(fastPower(3, 3));
    }

    static int fastPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = res * a;

            a = a * a;
            b >>= 1;
        }
        return res;
    }

    static int fastPowerUsingModuloArithematics(int a, int b, int n) {
        int res = 1;
        while (b > 0) {
            if ((b & 1) != 0)
                res = (res * (a % n)) % n;

            a = (a % n * a % n) % n;
            b >>= 1;
        }
        return res;
    }
}
