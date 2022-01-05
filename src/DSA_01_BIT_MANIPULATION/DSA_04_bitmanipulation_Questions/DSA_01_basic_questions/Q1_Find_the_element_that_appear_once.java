package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q1_Find_the_element_that_appear_once {

    public static void main(String[] args) {
        int[] arr = {12,12,12,14};
        System.out.println(getUnique(arr));
    }
    // Anuj Bhaiya logic
    static int UniqueELement(int[] arr, int k) {
        byte int_size = 4;
        int total_size = 8 * int_size;

        int[] count = new int[total_size];

        for (int i = 0; i < total_size; i++) {
            int mask = 1 << i;
            for (int j = 0; j < arr.length; j++) {
                if ((arr[j] & mask) != 0) {
                    count[i] += 1;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < total_size; i++) {
            int remainder = count[i] % k;
            int value = 1 << i;
            result += remainder * value;
        }

        return result;
    }

    // geeks for geeks logic
    // only for repeating thrice
    static int getUnique(int[] arr){
        int ones = 0 , twos = 0 ;
        int common_bit_mask ;

        for (int i = 0; i < arr.length; i++) {

            twos |= (ones & arr[i]);

            ones ^= arr[i];

            common_bit_mask = ~(ones & twos);

            ones &= common_bit_mask ;

            twos &= common_bit_mask ;
        }
        return ones ;
    }
}
