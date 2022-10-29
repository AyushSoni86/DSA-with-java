import java.util.Arrays;

public class AggressiveCows{
	public static void main(String[] args){
		int[] arr = {1, 2, 4, 8, 9};
		int answer = aggresiveCows(arr, 3);
		System.out.println(answer);	                           	
	}
	static int aggresiveCows(int[] stalls, int cows){
		Arrays.sort(stalls);
		int low = 0, high = stalls[stalls.length - 1] - stalls[0];
		int result = 0;

		while(low <= high){
			int mid = low + (high - low)/2;
			if(canPlace(stalls, cows, mid)){
				result = mid;
				low = mid + 1;
			}
			else{
				high = mid - 1;
			}
		}
		return result;	
	}

	static boolean canPlace(int[] stalls, int cows, int mid){
		int cordinate = stalls[0], cowsCount = 1;
		for(int i = 0 ; i < stalls.length ; i++){
			if(stalls[i] - cordinate >= mid){
				cowsCount ++;
				cordinate = stalls[i];
			}
			if(cowsCount == cows) return true;
		}		

		return false;
	}

}