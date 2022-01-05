package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q11_Count_number_of_bits_to_be_flipped_to_convert_A_to_B {
    public static void main(String[] args) {
        System.out.println(convert(8,20));
        System.out.println(findBits(8,20));
    }

    static int convert(int a, int b) {
        int count = 0;
        int val = a ^ b;
        while (val > 0) {
            if ((val & 1) == 0) {
                val >>= 1;
            } else {
                count++;
                val >>= 1;
            }
        }

        return count;
    }

    static int findBits(int a , int b){
       int bits = 0;
       int val = a ^ b ;
       while(true){
           if(val == 0){
               break ;
           }
           else{
               val &= (val-1);
               bits++ ;
           }
       }

        return bits ;
    }
}
