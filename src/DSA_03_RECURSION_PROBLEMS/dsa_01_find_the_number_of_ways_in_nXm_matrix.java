package DSA_03_RECURSION_PROBLEMS;

public class dsa_01_find_the_number_of_ways_in_nXm_matrix {
    public static void main(String[] args) {
        System.out.println(count(3, 3));
    }

    // base case will be
    // if row = 1
    // if column = 1

    static int count(int n, int m) {
        if (n == 1 || m == 1)
            return 1;
        return count(n - 1, m) + count(n, m - 1);
    }
}
