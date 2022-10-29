
import java.util.*;

public class CountSubsequence{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7};
		ArrayList<Integer> ans = new ArrayList<>();
		printSub(arr, ans, 0, 0, 10);
		System.out.println(countSub(arr,0,0,10));	
	}

	static void printSub(int[] arr, ArrayList<Integer> ans, int i, int s, int sum){
		if(i == arr.length){
			if(s == sum)
				System.out.println(ans);
			return;
		}
		ans.add(arr[i]);
		s += arr[i];
		printSub(arr, ans, i + 1 , s, sum);
		ans.remove(ans.size() - 1);
		s -= arr[i];
		printSub(arr, ans, i + 1, s, sum);
	}
	static int countSub(int[] arr, int i, int s, int sum){
		if(i == arr.length){
			if(s == sum) return 1;
			else return 0;
		}
		s += arr[i];
		int l = countSub(arr, i+1, s, sum);
		s -= arr[i];
		int r = countSub(arr, i+1, s, sum);
		return l+r;		
	}
}