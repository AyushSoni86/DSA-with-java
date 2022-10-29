package PracticeProblems.BinarySearch;

public class BS_01_books_allocation {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(booksAllocation(arr,2));
    }

    static int booksAllocation(int[] arr, int student) {
        int low = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int ans = -1;
        int high = sum;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (isPossible(arr, student, mid)) {
                ans = mid;
                high = mid - 1;
            } else
                low = mid + 1;
        }
        return ans;
    }

    private static boolean isPossible(int[] arr, int student, int mid) {
        int pagesCount = 0;
        int studentCount = 1;
        for (int i = 0; i < arr.length; i++) {
            if (pagesCount + arr[i] <= mid)
                pagesCount += arr[i];
            else {
                studentCount++;
                if (studentCount > student || arr[i] > mid)
                    return false;
                pagesCount = arr[i];
            }
        }
        return true;
    }
}
