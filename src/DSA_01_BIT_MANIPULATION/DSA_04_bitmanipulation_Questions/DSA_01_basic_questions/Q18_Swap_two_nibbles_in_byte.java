package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q18_Swap_two_nibbles_in_byte {
    public static void main(String[] args) {
        System.out.println(swapNibble(100));
    }

    /*  A nibble is a four-bit aggregation, or half an octet. There are two nibbles in a byte.
      Given a byte, swap the two nibbles in it.
      For example 100 is be represented as 01100100 in a byte (or 8 bits).
      The two nibbles are (0110) and (0100).
      If we swap the two nibbles, we get 01000110 which is 70 in decimal.
  */
    static int swapNibble(int num) {
        return (num & 0xf0) >> 4 | (num & 0x0f) << 4;
    }

    // 1) The expression “x & 0x0F” gives us last 4 bits of x.
    // 2) The expression “x & 0xF0” gives us first 4 bits of x.

}
