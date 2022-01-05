package DSA_01_BIT_MANIPULATION.DSA_01_BitManipulation_part1;

public class dsa_05_Finding_Even_Odd_Using_Bitwise {
    public static void main(String[] args) {
        Even_or_Odd(15);
    }

    static void Even_or_Odd(int n) {
        if ((n & 1) == 0) {
            System.out.println(n + " is even ");
        } else {
            System.out.println(n + " is odd ");
        }
    }
}
