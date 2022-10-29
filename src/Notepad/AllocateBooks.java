public class AllocateBooks{
	public static void main(String[] args){
		int[] arr = {10,20,30,40,50};
		int student = 2;
		int answer = booksAllocate(arr, student);
		System.out.println(answer);		
	}
	
	static int booksAllocate(int[] arr, int student){
		int ans = -1;
		int low = 0;
		int sum = 0;
		for(int i = 0; i < arr.length ; i++){
			sum += arr[i];
		}
		int high = sum;
		
		while(low <= high){
			int mid = low + (high - low)/2 ; 
			if(isPossible(arr, student , mid )){
				ans = mid;
				high = mid - 1;
			}
			else{
				low = mid + 1;
			}
		}		

		return ans;
	}
		
	static boolean isPossible(int[] arr, int student, int mid){
		int ans = 0;
		int studentCount = 1;
		for(int i = 0 ; i < arr.length ; i++){
			if( ans + arr[i] <= mid )
				ans += arr[i];
			else{
				studentCount++;
				if( studentCount > student || arr[i] > mid)
					return false;
				ans = arr[i];
			}
		}
		return true;
	}
}