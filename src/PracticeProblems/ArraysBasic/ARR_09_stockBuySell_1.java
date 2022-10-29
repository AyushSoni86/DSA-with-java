package PracticeProblems.ArraysBasic;

public class ARR_09_stockBuySell_1 {
    // buy only one stock
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 11};
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit2(arr));
    }

    static int maxProfit2(int[] arr) {
        int maxi = 0;
        int minSoFar = arr[0];
        for (int i = 0; i < arr.length; i++) {
            minSoFar = Math.min(minSoFar, arr[i]);
            int profit = arr[i] - minSoFar;
            maxi = Math.max(profit, maxi);
        }
        return maxi;
    }


    static int maxProfit(int[] arr) {
        int[] aux = new int[arr.length];
        aux[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            aux[i] = Math.min(aux[i - 1], arr[i]);
        }
        int maxi = 0;
        for (int i = 0; i < arr.length; i++) {
            int profit = arr[i] - aux[i];
            maxi = Math.max(maxi, profit);
        }
        return maxi;
    }
}
