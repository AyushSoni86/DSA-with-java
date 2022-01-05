package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2.Test_questions;

public class findingNumberOfSetBits {
    public int numSetBits(long a) {
        int count = 0 ;
        while(true){
            if(a == 0){
                break ;
            }
            else{
                a= a & (a-1);
                count++;
            }
        }
        return count ;
    }
}
