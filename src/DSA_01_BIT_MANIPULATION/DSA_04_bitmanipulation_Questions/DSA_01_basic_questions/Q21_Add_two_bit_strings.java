package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q21_Add_two_bit_strings {
    public static void main(String[] args) {
        String str1 = "101011001" ;
        String str2 = "11001" ;
        System.out.println(addBItsString(new StringBuilder(str1), new StringBuilder(str2)));
    }

    static int makeEqualLength(StringBuilder str1, StringBuilder str2) {
        int len1 = str1.length();
        int len2 = str2.length();

        if (len1 < len2) {
            for (int i = 0; i < len2 - len1; i++) {
                str1.insert(0, '0');
            }
            return len2;
        } else if (len1 > len2) {
            for (int i = 0; i < len1 - len2; i++) {
                str2.insert(0, '0');
            }
        }
        return len1;
    }

    static String addBItsString(StringBuilder str1, StringBuilder str2) {
        String result = "";
        int length = makeEqualLength(str1, str2);

        String first = str1.toString();
        String second = str2.toString();

        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {

            int firstbit = first.charAt(i) - '0';

            int secondBit = second.charAt(i) - '0';

            int sum = (firstbit ^ secondBit ^ carry) + '0';

            result = String.valueOf((char)sum) + result ;

            carry = (firstbit & secondBit) | (secondBit & carry) | (firstbit & carry)  ;
        }
        if (carry ==1){
            result = "1" + result ;
        }
        return result ;
    }
}
