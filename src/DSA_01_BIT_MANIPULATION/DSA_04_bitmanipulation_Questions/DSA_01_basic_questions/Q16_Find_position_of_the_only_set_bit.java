package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q16_Find_position_of_the_only_set_bit {
    public static void main(String[] args) {
        int pos = positionOfSetBits(9);
        System.out.println((pos != -1)?"the position of last bit is " + pos :"invalid number ");
    }

    static boolean powerOfTwoOrNot(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }

    static int positionOfSetBits(int num) {
        if (!powerOfTwoOrNot(num)) {
            return -1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num >>= 1;
        }
        return count ;
    }
}
