package DSA_01_BIT_MANIPULATION.DSA_01_BitManipulation_part1;

public class dsa_01_Decimal_To_Binary {
    public static void main(String[] args) {
        int n = 66;
        dsa_01_Decimal_To_Binary DtoB = new dsa_01_Decimal_To_Binary();
        System.out.print("binary of " + n + " is ");
        DtoB.Decimal_to_binary(n);
    }

     void Decimal_to_binary(int decimal) {
        int index = 0;
        int[] binary = new int[40];
       // int digit;
        while (decimal > 0) {
            binary[index++] = decimal % 2;
//            sum=sum*10 +digit;
            decimal /= 2;
        }

        for (int j = index; j >= 0; j--) {
            System.out.print(binary[j]);
        }

    }
}
