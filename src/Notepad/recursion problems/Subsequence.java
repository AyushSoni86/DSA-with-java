import java.util.*;

public class Subsequence{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4};
		ArrayList<Integer> ans = new ArrayList<>();
//		int result = countSubsequence(arr, 0, 0, 6);
//		System.out.println(result);
		oneSubsequence(arr, ans, 0, 0, 6);
	}
	

	static void subsequence(int[] arr, ArrayList<Integer> ans, int index){
		if(index == arr.length){
			System.out.println(ans);
			return;
		}
		ans.add(arr[index]);
		subsequence(arr,ans,index+1);
		ans.remove(ans.size()-1);
		subsequence(arr,ans,index+1);
	}


	static void sumSubsequence(int[] arr, ArrayList<Integer> ans, int i, int s, int sum){
		if(i == arr.length){
			if(sum == s)
				System.out.println(ans);
			return;
		}
		ans.add(arr[i]); 
		s += arr[i];
		sumSubsequence(arr, ans, i + 1, s, sum);
		ans.remove(ans.size() - 1);
		s -= arr[i];
		sumSubsequence(arr, ans, i + 1, s, sum);
	}


	static boolean oneSubsequence(int[] arr , ArrayList<Integer>ans, int i , int s , int sum){
		if(i == arr.length){
			if(s == sum){
				System.out.println(ans);
				return true;
			}
			else return false;
		}
		ans.add(arr[i]);
		s += arr[i];
		if(oneSubsequence(arr, ans, i+1, s, sum)) return true;
		ans.remove(ans.size()-1);
		s -= arr[i];
		if(oneSubsequence(arr, ans, i+1, s, sum)) return true;
		return false;
	}


	static int countSubsequence(int[] arr, int i, int s, int sum){
		if(i == arr.length){
			if(s == sum) return 1;
			else return 0;
		}		
		s+=arr[i];
		int l = countSubsequence(arr, i+1, s, sum);
		s-=arr[i];
		int r = countSubsequence(arr, i+1, s, sum);
		return l + r;
	}
}