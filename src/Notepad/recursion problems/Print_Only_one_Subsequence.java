import java.util.*;

public class Print_Only_one_Subsequence{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4};
		ArrayList <Integer> ans = new ArrayList<>();
		int sum = 6;
		printS(arr, ans, 0, 0, sum);
	}

	static boolean printS(int[] arr, ArrayList<Integer> ans, int i, int s, int sum){
		if(i == arr.length){
			if(s == sum){
				System.out.println(ans);
				return true;
			} else return false;
		}
		
		ans.add(arr[i]);
		s += arr[i];
		if(printS(arr, ans, i+1 , s, sum) == true)
			return true;
		ans.remove(ans.size() - 1);
		s -= arr[i];
		if(printS(arr, ans, i+1 , s, sum) == true)
			return true;

		return false;
	}


}