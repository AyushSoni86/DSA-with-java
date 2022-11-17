package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q07_Compute_modulus_division_by_power_of_2_number {
    public static void main(String[] args) {
        System.out.println(computeModulo(34,16));
    }

    // This function will return n % d.
    // d must be one of: 1, 2, 4, 8, 16, 32,
    // i.e any power of 2
    static int computeModulo(int n , int d){
        return n & (d-1);

    }
}
