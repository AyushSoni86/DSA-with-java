package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q12_Efficient_way_to_multiply_with_7 {
    public static void main(String[] args) {
        System.out.println(multiply_by_7(7));
    }

    static int multiply_by_7(int n) {
        return (n << 3) - n;
    }
}
