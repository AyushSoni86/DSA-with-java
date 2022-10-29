import java.util.*;

public class PrintSubsequence_With_k_sum{
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		ArrayList<Integer> ans = new ArrayList<>();
		int sum = 5;
		printS(arr,ans,0,0,sum);
	}

	static void printS(int[] arr, ArrayList<Integer> ans, int i, int s, int sum){
		if(i == arr.length){
			if(s == sum)
				System.out.println(ans);
			return;
		}
		ans.add(arr[i]);
		s = s + arr[i];
		printS(arr,ans,i+1,s,sum);
		ans.remove(ans.size()-1);	
		s = s - arr[i];
		printS(arr,ans,i+1,s,sum);
	}
}