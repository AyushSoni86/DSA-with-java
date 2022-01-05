package DSA_01_BIT_MANIPULATION.DSA_03_BitManipulation_part3;

public class dsa_01_find_one_non_repeating_twice_elements {
    public static void main(String[] args) {
        int[] arr = {7, 12, 12, 34, 56, 21, 34, 56, 7};
        System.out.println("the non repeating element is " + nonRepeat(arr));
    }

    static int nonRepeat(int[] arr){
        int repeat = 0;
        for (int i = 0; i < arr.length; i++) {
            repeat = repeat ^ arr[i];
        }
        return repeat ;
    }
}
