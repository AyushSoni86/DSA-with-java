package Lecture24_Math_for_DSA;

public class Euclide_GCD {
    public static void main(String[] args) {
        System.out.println(GCD(12, 43));
    }

    static int GCD(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;

        while (a != b) {
            if (a > b) a = a - b;
            else b = b - a;
        }
        return a;
    }
}
