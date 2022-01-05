package DSA_02_MATHS_FOR_DSA.DSA_01_basic_math_part_1;

public class dsa_03_palindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(12334321)?"Palindrome":"Not Palindrome");
    }

    static boolean isPalindrome(int num ){
        int digit  , sum = 0 ;
        int temp = num ;
        while(num > 0){
            digit = num % 10 ;
            sum = sum*10 + digit ;
            num = num /10 ;
        }
        if (temp == sum )
            return true ;
        return false ;
    }
}
