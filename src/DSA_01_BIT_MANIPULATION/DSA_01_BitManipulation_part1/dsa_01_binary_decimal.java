package DSA_01_BIT_MANIPULATION.DSA_01_BitManipulation_part1;

public class dsa_01_binary_decimal {
    public static void main(String[] args) {
        System.out.println(getDecimal(110101));
    }
    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int mask = 1 << n ;
                int temp = binary%10;
                decimal += temp*mask;
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }
}
