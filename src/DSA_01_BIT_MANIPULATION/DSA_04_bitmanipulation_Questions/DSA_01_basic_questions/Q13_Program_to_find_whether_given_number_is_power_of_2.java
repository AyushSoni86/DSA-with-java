package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q13_Program_to_find_whether_given_number_is_power_of_2 {
    public static void main(String[] args) {
        System.out.println(powerOfTwo(4)?"Yes":"No");
        System.out.println(rightmostSetBit(64)?"Yes":"No");
    }


    // another way to find power of two ,
    // find the rightmost bit and see that it is equal to the num or not
    // if yes then it is a power of two else not
    static boolean rightmostSetBit(int num){
        if (num == 0){
            return false ;
        }
        if ((num &(~(num - 1)))== num){
            return true ;
        }
        return false ;
    }

    static boolean powerOfTwo(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) != 0) {
                count++;
                num = num >> 1;
            }
            else{
                num >>= 1;
            }
        }
        if (count == 1)
            return true;
        else
            return false;
    }
}
