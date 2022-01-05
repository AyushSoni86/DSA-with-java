package DSA_02_MATHS_FOR_DSA.DSA_02_Math_for_dsa_part_2;

public class dsa_01_prime_numbers {
    public static void main(String[] args) {
        for (int i = 2; i < 100000000; i++) {
            System.out.print(isPrime(i)?i+" ":"");
        }
     //   System.out.println(isPrime(222333) ? "Prime" : "Not Prime");
    }

    static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
