public class BinarySearchInInfiniteSortedArray{
	public static void main(String[] args){
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int index = binarySearch(arr, 7, 0, 10);
		System.out.println("key is present at index "+ index);


	}

	static int infiteSortedArray(int[] arr, int key){
		int low = 0, high = 1;
		while(arr[high] < key){
			low = high;
			high *= 2;
		}
		return binarySearch(arr, key , low, high);
	}
	static int binarySearch(int[] arr, int key, int low, int high){
		int mid = low + (high - low)/2;
		if(arr[mid] == key)
			return mid;
		if(key > arr[mid])
			return binarySearch(arr, key, mid + 1, high);
		else
			return binarySearch(arr, key, low, mid - 1);

	}





}