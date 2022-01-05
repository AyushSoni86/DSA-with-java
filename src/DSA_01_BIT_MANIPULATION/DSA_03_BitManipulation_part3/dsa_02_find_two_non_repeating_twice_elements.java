package DSA_01_BIT_MANIPULATION.DSA_03_BitManipulation_part3;

public class dsa_02_find_two_non_repeating_twice_elements {
    public static void main(String[] args) {
        int[] arr = {7, 12, 12, 3, 34, 56, 5, 34, 56, 7};
        UniqueElement(arr);
    }

    static void UniqueElement(int[] arr) {
        // what is the approach ?
        //step 1 - first find the XOR of the two numbers
        int sum = 0;
        for (int j : arr) {
            sum ^= j;
        }
        // step 2 - find the rightmost set bit of the sum
        sum &= (-sum);
        // step 3 - maintain sum1 for elements having same rightmost bit and
        int sum1 = 0, sum2 = 0;

        for (int j : arr) {
            if ((j & sum) > 0) {
                sum1 ^= j;
            } else {
                sum2 ^= j;
            }
        }
        System.out.println("the non repeating elements are " + sum1 + " and " + sum2);
    }
}

