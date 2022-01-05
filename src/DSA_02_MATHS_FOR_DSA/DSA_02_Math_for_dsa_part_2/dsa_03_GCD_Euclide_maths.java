package DSA_02_MATHS_FOR_DSA.DSA_02_Math_for_dsa_part_2;

public class dsa_03_GCD_Euclide_maths {

    /*  gcd of two number a, b is
        GCD( a, b ) = GCD( a - b, b )   where a > b
        also,
        GCD(a,b) = GCD( b, a % b )    where a % b != 0

     */
    public static void main(String[] args) {
        System.out.println(gcd(20, 4));
        System.out.println(gcd2(20, 4));
        System.out.println(gcdFancy(20, 4));
        System.out.println(findGcd(20, 4));
        System.out.println(find_GCD(20, 4));
        System.out.println(find_gcd_using_mod(4, 20));
    }

    // using loops
    static int findGcd(int x, int y) {
        int result = 1;
        for (int i = 1; i <= x && i <= y; i++) {
            if (x % i == 0 && y % i == 0)
                result = i;
        }
        return result;
    }

    static int find_GCD(int x, int y) {
        while (x != y) {
            if (x > y)
                x -= y;
            else
                y -= x;
        }
        return y;
    }

    static int find_gcd_using_mod(int x, int y) {

        int result = 0;
        int temp;
        while (y != 0) {
            temp = y;
            y = x % y;
            x = temp;
        }
        result = x;
        return result;
    }

    // using recursion
    // modulo arithematics
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static int gcdFancy(int a, int b) {
        return a % b == 0 ? b : gcdFancy(b, a % b);
    }

    // using euclide mathematics
    static int gcd2(int a, int b) {
        if (a == 0)
            return b;
        if (b == 0 || a == b)
            return a;
        if (a > b)
            return gcd2(a - b, b);
        return gcd2(a, b - a);
    }
}
