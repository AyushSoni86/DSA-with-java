package DSA_01_BIT_MANIPULATION.DSA_02_BitManipulation_part2;

public class dsa_01_find_ith_bit_2nd_way {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number : ");
//        int num = sc.nextInt();
//        System.out.println("Enter the bit you want : ");
       // int i = 6;
      /*  System.out.println((i_th_bit(98, 9) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 8) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 7) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 6) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 5) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 4) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 3) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 2) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 1) == 1) ? "bit is 1" : "bit is 0");
        System.out.println((i_th_bit(98, 0) == 1) ? "bit is 1" : "bit is 0");
*/
        for (int i = 6; i >=0; i--) {
            // binary of 98 = 1 1 0 0 0 1 0
            System.out.print(i_th_bit(98,i) + " ");
        }
    }

    private static int i_th_bit(int num, int i) {
        int mask = 1 << i;
        int finalVal = num & mask;
        if (finalVal > 0)
            return 1;
        else
            return 0;
    }

}
