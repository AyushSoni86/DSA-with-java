package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2.Test_questions;

public class trialingZeroesInBinaryNumber {
    public int solve(int a) {
        int count = 0 ;
        while((a & 1)== 0){
            a = a >> 1 ;
            count ++ ;
        }
        return count ;
    }
}
