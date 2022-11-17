package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q03_Add_1_to_given_number {
    public static void main(String[] args) {
        System.out.println(addOne_2(133));
    }

    static int addOne(int x) {
        return -(~x);
    }

    static int addOne_2(int x) {
        int m = 1;
        while ((x & m) >= 1) {
            x = x ^ m;
            m = m << 1;
        }
        x = x ^ m;
        return x;
    }
}
