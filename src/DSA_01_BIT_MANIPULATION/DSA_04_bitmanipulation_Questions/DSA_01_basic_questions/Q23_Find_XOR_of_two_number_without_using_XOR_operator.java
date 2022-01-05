package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q23_Find_XOR_of_two_number_without_using_XOR_operator {
    public static void main(String[] args) {
        System.out.println(find_XOR(3,5));
    }
    static int find_XOR(int a, int b){
        int result= (a | b) & (~a | ~b);

        return result ;
    }
}
