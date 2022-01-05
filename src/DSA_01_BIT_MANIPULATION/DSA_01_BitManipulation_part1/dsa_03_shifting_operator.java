package DSA_01_BIT_MANIPULATION.DSA_01_BitManipulation_part1;

public class dsa_03_shifting_operator {
    public static void main(String[] args) {
        System.out.println(Divide_By_Two(6));
        System.out.println(Multiply_By_Two(6));
    }

    static int Divide_By_Two(int n) {
        n = n >> 1;
        return n;
    }

    static int Multiply_By_Two(int n) {
        n = n << 1;
        return n;
    }
}
