public class RotateArray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9,0};
//		printArray(arr);
//		rotateArray(arr);
//		printArray(arr);
//		rotateArray(arr);
		printArray(arr);
		rotateByNum(arr, 3);
		printArray(arr);	
	}

	static void arrayInsertion(int[] arr, int key){
		 
	}
	
	static void printArray(int[] arr){
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	static void rotateArray(int[] arr){
		int temp = arr[0];
		for(int i = 0 ; i < arr.length - 1 ; i++){
			arr[i] = arr[i + 1];
		}
		arr[arr.length-1] = temp;
	}

	static void rotateByNum(int[] arr, int d){
		for(int i = 0 ; i < d ; i++){
			rotateArray(arr);
		}	

	} 

}