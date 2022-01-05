package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2.Test_questions;

public class reverse_bits_using_array {
// approach successful
    public static void main(String[] args) {
        System.out.println(reverseBit(3));
    //    System.out.println((long)Math.pow(2,31) +  (long) Math.pow(2,30));
        // answer  =  3221225472
    }
    static long reverseBit(int n) {
        int[] arr = new int[32];
        for (int i = 0; i < arr.length; i++) {
            if ((n & 1) == 0) {
                arr[i] = 0;
                n = n >> 1;
            } else {
                arr[i] = 1;
                n = n >> 1;
            }
        }
        long value = 0;
        int count = arr.length -1;
        for (int j = 0; j < arr.length; j++) {
            value = value + arr[j] * (long) (Math.pow(2, count));
            count--;
        }

        return value ;
    }
}
