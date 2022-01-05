package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2.Test_questions;

public class DivisionWithBitwiseOperators {

    public int divide(int A, int B) {
        //System.out.println(Integer.MIN_VALUE - 1);
        //System.out.println(Integer.MAX_VALUE);
        if(A == Integer.MIN_VALUE && B == -1){
            return Integer.MAX_VALUE;
        }
        int a = Math.abs(A);
        int b = Math.abs(B);
        int res = 0;
        while(a - b >= 0){

            int x = 0;
            while( a - (b << 1 << x) >= 0){
                x++;
            }
            res += 1 << x;
            a -= b << x;
        }
        return (A >= 0) == (B >= 0) ? res :-res;
    }
    
}
