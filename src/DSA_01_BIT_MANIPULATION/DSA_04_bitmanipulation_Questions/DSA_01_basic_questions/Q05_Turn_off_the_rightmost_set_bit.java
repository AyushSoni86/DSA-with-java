package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q05_Turn_off_the_rightmost_set_bit {
    public static void main(String[] args) {
//        System.out.println(12 & (-12));
        System.out.println(clear_rightmost_bit(7));
    }

    static int clear_rightmost_bit(int x) {
        int rightmostbit = x & (-x);
        x = x & (~rightmostbit);
        return x;
    }

    static int clearRightmost(int x){
        return x & (x-1);
    }
}
