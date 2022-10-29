public class RainwaterTrapWithoutSpace{
	public static void main(String[] args){
		int[] arr = {6,2,5,0,4,5};
		int water = trappedWater(arr);
		System.out.println("The water trapped is " + water + " units"); 		
	}
	
	static int trappedWater(int[] arr){
		int water = 0;
		int n = arr.length;
		int left = 0;
		int right = n-1;
		int maxLeft = arr[left];
		int maxRight = arr[right];

		while(left < right){
			if(arr[left] < arr[right]){
				left++;
				maxLeft = Math.max(maxLeft, arr[left]);
				water += (maxLeft - arr[left]);
			}
			else{
				right--;
				maxRight = Math.max(maxRight, arr[right]);
				water += (maxRight - arr[right]);
			}
		}
		return water;
	}
}