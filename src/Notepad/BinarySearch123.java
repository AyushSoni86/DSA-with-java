import java.util.Scanner;
public class BinarySearch123{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println("Enter the you want to search : ");
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		System.out.println((binarySearch(arr, key)!= -1)?key +" found at index " + index :"Key not Found");
	}
	static int binarySearch(int[] arr, int key){
		int low = 0;
		int high = arr.length -1 ;
		
		while(low <= high){
			int mid = low + (high - low)/2;
			if(arr[mid]== key)
				return mid;
			if(arr[mid] > key)
				high = mid - 1;
			else
				low = mid + 1;

		}		


		return -1;
	}
}