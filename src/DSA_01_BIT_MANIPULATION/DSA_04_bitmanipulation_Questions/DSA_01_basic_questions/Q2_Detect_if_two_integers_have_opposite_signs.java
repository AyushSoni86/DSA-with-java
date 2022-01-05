package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q2_Detect_if_two_integers_have_opposite_signs {

    public static void main(String[] args) {
        System.out.println((opposite(23,-223)?
                "Signs are Opposite ":
                "Signs are not Opposite"));
    }
    static boolean oppositeSigns(int a , int b){
        return( (a ^ b) < 0);
    }

    static boolean opposite(int x, int y){
        return (x < 0)?(y >= 0): (y<0);
    }
}
