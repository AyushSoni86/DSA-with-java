package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q19_turn_off_particular_bit_in_number {
    public static void main(String[] args) {
        System.out.println(clear_ith_Bit(10,1));
    }
// 1010
    static int clear_ith_Bit(int n, int i){
        // 10010101010
        int mask = ~(1 << i );

        n = n & mask ;

        return n;
    }
}
