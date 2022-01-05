package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2;

public class dsa_04_find_bits_to_convert_a_to_b {
    public static void main(String[] args) {
        System.out.println(find_bits(153,106));
    }
    static int find_bits(int a , int b){
        int result = a ^ b ;
        int bits =  find_Set_Bits(result);
        return bits ;
    }

    static int find_Set_Bits(int num){
        int bits = 0;
       // int n = 0 ;
        while (true){
            if (num == 0){
                break ;
            }
            else{
                num = num & (num-1);
                bits++ ;
            }
        }
        return bits ;
    }
}
