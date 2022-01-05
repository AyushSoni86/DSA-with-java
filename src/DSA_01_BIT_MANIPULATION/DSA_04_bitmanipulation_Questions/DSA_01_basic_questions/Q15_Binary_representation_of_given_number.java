package DSA_01_BIT_MANIPULATION.DSA_04_bitmanipulation_Questions.DSA_01_basic_questions;

public class Q15_Binary_representation_of_given_number {
    public static void main(String[] args) {
        int binary  = binaryRepresentation(13);
        System.out.println(binary);
        decimalToBinary(8);
        System.out.println();
        d_to_B(4);
    }

    // another method
    static  void decimalToBinary(int decimal){
        long i ;
        System.out.print(0);
        for ( i = 1<<30; i > 0 ; i=i/2) {
            if ((decimal & i) != 0){
            System.out.print(1);
            }
            else{
                System.out.print(0);
            }
        }
    }

    // recursive approach
    static void d_to_B(int num ){
        if(num > 1){
            d_to_B(num/2);
        }
        System.out.print(num%2);

    }
    static int binaryRepresentation( int decimal ){
        int index = 0 ;
        int bit = 0 ;
        int[] binary = new int[32];
        while (decimal > 0){
            binary[index++] = decimal % 2 ;

            decimal = decimal/2 ;
        }
        for (int i = index; i >= 0; i--) {
            bit = bit*10 + binary[i];
        }
        return bit ;
    }
}
