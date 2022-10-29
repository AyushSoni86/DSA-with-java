public class SlidingWindowMaximum {
    public static void main(String[] args) {
        int [] arr = {6,8,3,2,1,4};
        int [] arr2 = {2,5,1,8,2,9,1};
        System.out.println(maxSum(arr,3));
        System.out.println(maxSum(arr2,3));
    }

    static int maxSum(int[] arr, int window) {
        int max = Integer.MIN_VALUE;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (j < arr.length) {
            sum += arr[j];
            if (j - i + 1 < window) {
                j++;
            } else  {
                max = Math.max(max, sum);
                sum -= arr[i++];
                j++;
            }
        }
        return max;
    }
}
