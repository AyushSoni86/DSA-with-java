public class AllCodesForToday{
	public static void main(String[] args){
	//	int[] arr = {4,-2,-3,6,1};
	//	printArray(arr);
	//	selectionSort(arr);
	//	printArray(arr);
		System.out.println(powerOfTwo(8));
	}
	static boolean powerOfTwo(int num){
		int ans = 1;
		for(int i = 0 ; i < 31 ; i++){
			if(num == ans) return true;
			ans *= 2;
		}
		return false ;
	}

	static int compliment(int num){
		int temp = num;
		int mask = 0;
		while(temp != 0){
			mask = (mask << 1) | 1;
			temp >>= 1;
		}		

		return mask & (~num);
	}	

	static long reverseBits(int num){
		long rev = 0;
		for(int i = 0 ; i < 32 ; i++){
			rev = rev << 1;
			long mask = 1 << i;
			if((num & mask) != 0){
				rev = rev | 1 ;
			}
		}

		return rev;
	}
	static int setBits(int num){
		int cnt = 0;
		while(num != 0){
			cnt++;
			num = num & (num - 1);
		}
		return cnt;
	}

	static int maxSumContArray(int[] arr){
		int maxSum = 0;
		int currentSum = 0;
		for(int i = 0 ; i < arr.length ; i++){
			currentSum += arr[i] ;
			if(currentSum > maxSum) maxSum = currentSum;
			if(currentSum < 0) currentSum = 0;
		} 		
		return maxSum;
	}

	static void printArray(int[] arr){
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i] + " ");	
		}
		System.out.println();
	}

	static void selectionSort(int[] arr){
		int indexOfmin , temp ;
		for(int i = 0 ; i < arr.length ; i++) {
			indexOfmin = i;
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(arr[j] < arr[indexOfmin]){
					indexOfmin = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[indexOfmin];
			arr[indexOfmin] = temp;
		}		
	}

	static void insertionSort(int[] arr) {
		int j , key ;
		for(int i = 1 ; i < arr.length ; i++) {
			j = i - 1;
			key = arr[i];
			while( j >= 0 && arr[j] > key ) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}
	}
}