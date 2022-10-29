public class PartitionProblem1{
	public static void main(String[] args){
		

	}
	static int partitionProb(int[] arr, int painters){
		int result = 0;
		int low = 0;
		int sum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			sum += arr[i];
		}
		int high = sum; 		
		while(low <=high){
			int mid = low + (high - low)/2 ;
			//if()
		}


		return result;
	}

}