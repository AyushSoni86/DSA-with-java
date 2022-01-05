package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q14_Position_of_rightmost_set_bit {
    public static void main(String[] args) {
        System.out.println(positionOfRightmostBit(8));
    }
    static int positionOfRightmostBit(int num ){
        int count = 0 ;
        while(num > 0){
            if ((num & 1) != 0){
                count++ ;
               // num >>= 1;
                break ;
            }
            else{
                count++;
                num >>= 1;
            }
        }
        return count ;
    }
}
