package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q06_Find_whether_given_number_is_power_of_4_or_not {
    public static void main(String[] args) {
        System.out.println((powerOf4OrNot(256)==1)?"Yes":"NO");
    }

    static int powerOf4OrNot(int n) {
        int count = 0;

        //      n & ( n -1 ) gives the rightmost set bit

        int x = n & (n - 1);

        if (n > 0 && (x == 0)) {
            while (n > 1) {
                n = n >> 1;
                count ++;
            }
            return (count % 2 == 0) ? 1 : 0;
        }
        return 0;
    }
}
