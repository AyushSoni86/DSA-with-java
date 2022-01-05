package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2;

public class dsa_02_set_ith_bit {

    // setting  a bit means to convert 0 -> 1
    public static void main(String[] args) {
        // binary of 98 = 1 1 0 0 0 1 0
        // answer is 106 =1 1 0 1 0 1 0
        System.out.println(set_ith_Bit(98,3));

    }
    static int set_ith_Bit(int num , int i){
        int mask = 1 << i ;
        int val = num | mask;
        return val ;

    }
}
