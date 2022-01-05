package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q22_Check_if_two_numbers_are_equal_without_using_arithmetic_and_comparison_operators {
    public static void main(String[] args) {
        System.out.println(equalityCheck(1,12)?"numbers are equal": "numbers are not equal");
    }
    static boolean equalityCheck(int a , int b){

        if((a ^ b) ==0){
            return true ;
        }
        return false ;

    }
}
