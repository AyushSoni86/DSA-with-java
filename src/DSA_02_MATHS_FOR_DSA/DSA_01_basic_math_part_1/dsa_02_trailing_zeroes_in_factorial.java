package DSA_02_MATHS_FOR_DSA.DSA_01_basic_math_part_1;

public class dsa_02_trailing_zeroes_in_factorial {
    public static void main(String[] args) {
        System.out.println("Trailing zeroes are : "+trailing_zeroes(255));
    }

    static int trailing_zeroes(int num ){
        int result = 0 ;
        for (int i = 5; i <= num; i*=5) {
            result = result + num/i;
        }
        return result ;
    }
}
