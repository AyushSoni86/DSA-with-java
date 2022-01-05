package DSA_02_MATHS_FOR_DSA.DSA_01_basic_math_part_1;

public class dsa_01_factorial_of_number {
    public static void main(String[] args) {
        System.out.println(factorial(8));
    }

    static int factorial(int num ){
        int result = 1 ;
        for (int i = 1; i <= num; i++) {
            result = result * i ;
        }
        return result ;
    }
}
