package PracticeProblems.ArraysBasic;

public class ARR_10_stockBuySell_2 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 9, 2, 11};
        System.out.println(maxProfit(arr));
    }

    static int maxProfit(int[] arr) {
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1])
                profit += arr[i] - arr[i - 1];
        }
        return profit;
    }
}
