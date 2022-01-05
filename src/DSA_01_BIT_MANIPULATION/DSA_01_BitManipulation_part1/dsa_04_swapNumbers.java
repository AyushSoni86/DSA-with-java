package DSA_01_BIT_MANIPULATION.DSA_01_BitManipulation_part1;

public class dsa_04_swapNumbers {
    public static void main(String[] args) {
        swap_using_XOR(23,45);
    }

    static void swap_using_XOR(int a, int b) {
        System.out.println("before swap a = " + a + " and b = " + b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("after swap a = " + a + " and b = " + b);
    }
}
