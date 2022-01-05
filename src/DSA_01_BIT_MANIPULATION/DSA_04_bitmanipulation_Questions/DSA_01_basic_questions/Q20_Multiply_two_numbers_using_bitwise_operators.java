package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q20_Multiply_two_numbers_using_bitwise_operators {
    public static void main(String[] args) {
        System.out.println(multiplyTwoNumber(3,8));
    }

    //  Russian Peasant

    static int multiplyTwoNumber(int a, int b) {
        int sum = 0;
        while (b > 0) {
            if ((b & 1) != 0) {  // if the value is odd then add to sum
                sum += a;
            }
            a <<= 1;    //  left shift a by 1
            b >>= 1;    // right shift b by 1
        }
        return sum;
    }
}
