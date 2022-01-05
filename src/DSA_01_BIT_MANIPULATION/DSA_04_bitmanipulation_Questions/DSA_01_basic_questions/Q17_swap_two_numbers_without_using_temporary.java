package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q17_swap_two_numbers_without_using_temporary {

    public static void main(String[] args) {
        int a = 32;
        int b = 34;
        System.out.println("before swap a= " + a + ", b = " + b);
        swap(a,b);
    }

    static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swap a= " + a + ", b = " + b);

    }
}

