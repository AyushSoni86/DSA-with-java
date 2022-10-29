import java.util.*;

class PrintSubsequence{
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		ArrayList<Integer> ans = new ArrayList<>();
		printF(arr,ans,0);

	}

	public static void printF(int[] arr, ArrayList<Integer> ans , int i){
		if(i == arr.length){
			System.out.println(ans);
			return;
		}
		ans.add(arr[i]);
		printF(arr,ans,i+1);
		ans.remove(ans.size()-1);
		printF(arr,ans,i+1);
	} 
}