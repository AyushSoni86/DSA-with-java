import java.util.*;
public class StockBuyAndSell
{
	public static void main(String[] args)
	{
		int[] arr = {6,2,5,0,4,5};
		System.out.println("Maximum Profit is " + stockBuySellApproach1(arr));
		System.out.println("Maximum Profit is " + stockBuySellApproach2(arr));
		System.out.println("Maximum Profit is " + stockBuySellApproach3(arr));
	}

	static void printArray(int[] arr)
	{
		for(int i = 0 ; i < arr.length ; i++)
		{
			System.out.print(arr[i]);
		} 
		System.out.println();
	}

	// optimized solution
	// time complexiety O(n)
	static int stockBuySellApproach1(int[] arr)
	{
		int minSoFar = arr[0];
		int maxProfit = 0;

		for(int i = 0 ; i < arr.length ; i++)
		{
			minSoFar = Math.min(minSoFar , arr[i]);
			int profit = arr[i] - minSoFar ;
			maxProfit = Math.max(maxProfit , profit);
		}
		return maxProfit;
	}

	// Brute Force Solution
	// complexiety O(n^2)

	static int stockBuySellApproach2(int[] arr)
	{
		int profit = 0;
		int maxProfit = 0;

		for(int i = 0 ; i < arr.length ; i++)
		{
			for(int j = i ; j < arr.length ; j++)
			{
				profit = arr[j] - arr[i];
				maxProfit = Math.max(maxProfit , profit);
			}
		}
		return maxProfit;
	}

	// little optimized
	// time complexiety O(n) and space complexiety O(n)
	static int stockBuySellApproach3(int[] arr)
	{
		int[] aux  = new int[arr.length];
		int profit = 0;
		int maxProfit = 0;
		aux[0] = arr[0];

		for(int i = 1 ; i < arr.length ; i++)
		{
			aux[i] = Math.min(arr[i] , aux[i-1]);
		}

		for(int i = 0 ; i < arr.length ; i++)
		{
			profit = arr[i] - aux[i];
			maxProfit = Math.max(maxProfit , profit);
		}
	
		return maxProfit ;	
	}
}