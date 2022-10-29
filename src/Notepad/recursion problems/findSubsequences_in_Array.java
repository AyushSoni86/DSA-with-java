import java.util.*;

public class findSubsequences_in_Array {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2 };
		ArrayList<Integer> ans = new ArrayList<>();
		System.out.println("Printing all the sunsequences ");
		printS(arr, ans, 0);
		System.out.println("Subsequence of Sum provided ");
		printF(arr, ans, 0, 0, 6);
		System.out.println("Printing only one subsequence");
		printO(arr, ans, 0, 0, 6);
		System.out.println("Printing count of thsubsequences");
		int count = printC(arr, 0, 0, 6);
		System.out.println(count);

	}

	// printing all the subsequences
	static void printS(int[] arr, ArrayList<Integer> ans, int i) {

		if (i == arr.length) {
			System.out.println(ans);
			return;
		}

		ans.add(arr[i]);
		printS(arr, ans, i + 1);
		ans.remove(ans.size() - 1);
		printS(arr, ans, i + 1);
	}

	// printing subsequences with k sum
	static void printF(int[] arr, ArrayList<Integer> ans, int i, int s, int sum) {
		if (i == arr.length) {
			if (s == sum) {
				System.out.println(ans);
			}
			return;
		}

		ans.add(arr[i]);
		s += arr[i];
		printF(arr, ans, i + 1, s, sum);
		ans.remove(ans.size() - 1);
		s -= arr[i];
		printF(arr, ans, i + 1, s, sum);
	}

	// printing only one sequence with k sum
	static boolean printO(int[] arr, ArrayList<Integer> ans, int i, int s, int sum) {
		if (i == arr.length) {
			if (s == sum) {
				System.out.println(ans);
				return true;
			} else
				return false;
		}

		ans.add(arr[i]);
		s += arr[i];
		if (printO(arr, ans, i + 1, s, sum) == true)
			return true;
		ans.remove(ans.size() - 1);
		s -= arr[i];
		if (printO(arr, ans, i + 1, s, sum) == true)
			return true;
		return false;
	}

	// printing count of the subsequences
	static int printC(int[] arr, int i, int s, int sum) {
		if (i == arr.length) {
			if (s == sum)
				return 1;
			else
				return 0;
		}
		s += arr[i];
		int l = printC(arr, i + 1, s, sum);
		s -= arr[i];
		int r = printC(arr, i + 1, s, sum);
		return l + r;
	}

}