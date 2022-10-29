public class BuySellMultipleStocks{
	public static void main(String[] args){
		int[] arr = {5,2,7,3,6,1,2,4};
		System.out.println("Maximum profit will be " + buySellMultipleStocks(arr));
	}
	
	static int buySellMultipleStocks(int[] arr){
		int profit = 0;
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i] > arr[i-1])
				profit = profit + arr[i] - arr[i-1];
		}
		return profit ;
	}


}