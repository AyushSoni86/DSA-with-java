package PracticeProblems.ArraysBasic;

public class ARR_07_majorityElements {
    public static void main(String[] args) {
        int[] arr = {3, 3, 4, 2, 4, 4, 2, 4, 4};
        System.out.println(isMajority(arr));
    }

    static int isMajority(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[major(arr)])
                count++;
        }
        return (count > arr.length / 2) ? arr[major(arr)] : -1;
    }

    static int major(int[] arr) {
        int count = 1;
        int majIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[majIndex])
                count++;
            else {
                count--;
                if (count == 0) {
                    majIndex = i;
                    count = 1;
                }
            }
        }
        return majIndex;
    }
}
