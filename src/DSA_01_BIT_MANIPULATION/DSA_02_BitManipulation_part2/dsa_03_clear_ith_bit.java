package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2;

public class dsa_03_clear_ith_bit {
    public static void main(String[] args) {
        // clearing a bit means to convert 1 -> 0

        // binary of 98 = 1 1 0 0 0 1 0
        // answer is 106 =1 0 0 0 0 1 0

        System.out.println(clear_ith_bit(98, 5));
    }
    static int clear_ith_bit(int num , int i){
        // create a mask by left shifting one i times
        int mask = 1 << i ;
        // then negate the mask, perform adn (&) operation with num
        int result = ~(mask) & num ;
        // store the value in variable and return it
        return result;
    }
}
