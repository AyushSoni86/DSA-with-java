package DSA_02_MATHS_FOR_DSA.DSA_03_math_for_dsa_part_3;

public class dsa_02_modulo_arithematics {
    public static void main(String[] args) {
        System.out.println(moduloArit(234,234,1000000007));
    }

    static long moduloArit(long x, long y, long n) {
        long res = 1;
        while (y > 0) {
            if ((y & 1) != 0) {
                res = (res * x % n) % n;
            }
            x = (x % n * x % n) % n;
            y >>= 1;
        }
        return res;
    }
}
