package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2.Test_questions;

public class reverse_the_bits_of_a_binary_number {
    public static int rotateBinary(int number) {
        int res = 0;
        while (number > 0) {
            res = res << 1;
            // if the number is odd then it will be added to the result
            res = res | (number & 1);
            number = number >> 1;
        }
        return res;
    }


    public static long reverse(long A) {
        long rev = 0;

        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            int mask = 1 << i ;
            if ((A & mask) != 0)
                rev = rev | 1;
        }

        return rev;

    }

    public static void main(String[] args) {
        int x = 3;
        // BinaryRotate b = new BinaryRotate();
        System.out.println("after reversing the bits it becomes " + reverse(x));
    }
}
