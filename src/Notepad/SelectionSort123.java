public class SelectionSort123{
	public static void main(String[] args){
		int[] arr = {4,3,5,2,1};
		int[] arr2 = {8,0,7,1,3};
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
		System.out.println();
		printArray(arr2);
		selectionSort(arr2);
		printArray(arr2);				
	}

	static void printArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}	

	static void selectionSort(int[] arr){

		for(int i = 0 ; i < arr.length ; i++){
			int indexOfMin = i ;
			for(int j = i+1; j < arr.length ; j++){
				if(arr[j] < arr[indexOfMin]){
					indexOfMin = j ;
				}
			}
			int temp = arr[i];
			arr[i] = arr[indexOfMin];
			arr[indexOfMin] = temp;

		}		
	}

}