public class InsertionSort12{
	public static void main(String[] args){
		int[] arr = {4,3,5,2,1};
		printArray(arr);
		insertionSort(arr);
		printArray(arr);

	}
	static void printArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	static void insertionSort(int[] arr){
		
		for(int i = 1 ; i < arr.length ; i++){
			int j = i - 1 ;
			int key = arr[i];
			while(j >= 0 && arr[j] > key){
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = key;
		}

	}
}