public class BoooksAllocationProblem{
	public static void main(String[] args){
		int[] arr = {10, 20, 30, 40, 50};
		int books = arr.length;
		int student = 2;
		int answer = allocateBooks(arr, books, student);
		System.out.println(answer);	



	}
	
	static int allocateBooks(int[] arr, int books, int student){
		int ans = -1;
		int start = 0;
		int sum = 0;
		for(int i = 0 ; i < books ; i++){
			sum += arr[i];
		}
		int end = sum ;
		int mid = start + (end - start)/2;
		while(start <= end){
			if(isPossible(arr, books, student, mid)){
				ans = mid;
				end = mid - 1;
			}
			else{
				start = mid + 1;
			}
			mid = start + (end - start)/2;
		}
		return ans ;
	}

	static boolean isPossible(int []arr, int books, int student, int mid){
		int studentCount = 1;
		int pagesCount = 0;
		for(int i = 0 ; i < books ; i++){
			if(pagesCount + arr[i] <= mid){
				pagesCount += arr[i];
			}
			else{
				studentCount++;
				if( studentCount > student || arr[i] > mid )
					return false;
				pagesCount = arr[i];
			}
		}		
		return true;
	}







}