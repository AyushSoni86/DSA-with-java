package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q4_Multiply_given_Integer_with_7_by_2 {
    // multiply given digit by 3.5
    public static void main(String[] args) {
        System.out.println(multiply_by_3_points(34));
    }

    static int multiply(int x) {
        int sum = (x << 1) + (x >> 1) + x;
        return sum;
    }

    static int multiply_by_3points(int x) {
        int sum = ((x << 3) - x) >> 1;
        return sum;
    }

    static int multiply_by_3_points(int x) {
        int r = 0;
        int x1 = x << 1;
        int x2 = x >> 1;

        r = (x ^ x1) ^ x2;
        int c = (x & x1) | (x & x2) | (x1 & x2);

        while (c > 0) {
            c = c << 1;
            int t = r;
            r = r ^ c;
            c &= t;
        }

        r = r >> 1;
        return r;
    }
}
