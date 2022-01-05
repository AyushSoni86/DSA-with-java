package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q10_Count_set_bits_in_an_integer {

    static int[] BitsSetTable256 = new int[256];

    public static void main(String[] args) {
        System.out.println(numberOfSetBits(9));
    }

    static int numberOfSetBits(int num) {
        int count = 0;
        while (num > 0) {
            if ((num & 1) == 0) {
                num >>= 1;
            } else {
                count++;
                num >>= 1;
            }
        }
        return count;
    }


    // using Brian Kernighan’s Algorithm
    static int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
    }

    // Brian Kernighan’s Algorithm  Recursively
    static int countRecursively(int n) {
        if (n == 0) {
            return 0;
        }
        return 1 + countSetBits(n & (n - 1));
    }

    // using lookup table
    static void initialize(){
        BitsSetTable256[0] = 0 ;
        for (int i = 0; i < 256; i++) {
            BitsSetTable256[i] = (i & 1) + BitsSetTable256[i /2];
        }
    }

    static int countSetBits01(int n)
    {
        return (BitsSetTable256[n & 0xff]
                + BitsSetTable256[(n >> 8) & 0xff]
                + BitsSetTable256[(n >> 16) & 0xff]
                + BitsSetTable256[n >> 24]);
    }
}
