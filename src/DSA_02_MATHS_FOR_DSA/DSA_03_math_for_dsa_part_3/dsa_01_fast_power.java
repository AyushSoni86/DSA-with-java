package DSA_02_MATHS_FOR_DSA.DSA_03_math_for_dsa_part_3;

public class dsa_01_fast_power {
    public static void main(String[] args) {
        System.out.println(fastPower(3,5));
        System.out.println(fastPowerBitStyle(3,5));
    }

    static int fastPower(int a, int b) {
        int res = 1;
        while (b > 0) {
            if (b % 2 != 0) {
                res *= a;
            }
            a = a * a;
            b = b / 2;
        }
        return res;
    }

    static int fastPowerBitStyle(int a, int b) {
        int res = 1;
        while (b > 0) {
            if ((b &1) != 0) {
                res *= a;
            }
            a = a * a;
            b = b >> 1;
        }
        return res;
    }
}
