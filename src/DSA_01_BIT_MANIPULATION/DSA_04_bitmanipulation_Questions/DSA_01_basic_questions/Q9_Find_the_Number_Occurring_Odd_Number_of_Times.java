package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q9_Find_the_Number_Occurring_Odd_Number_of_Times {
    public static void main(String[] args) {
        int[] arr = {23,23,45,67,45,89,89,67,67};
        System.out.println(findUnique(arr));
    }
    static int findUnique(int[] arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result ^= arr[i];
        }
        return result ;
    }

}
