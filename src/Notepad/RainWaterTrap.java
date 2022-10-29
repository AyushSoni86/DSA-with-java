public class RainWaterTrap {
	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4, 0, 1, 3, 2 };
		int totalWater = trap(arr);
		System.out.println("The water is " + totalWater + " units");
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int trap(int[] arr) {
		
		int n = arr.length;
		int left = 0, water = 0;
		int right = n - 1;
		int maxLeft = arr[left];
		int maxRight = arr[right];

		while (left < right) {

			if (arr[left] < arr[right]) {
				left++;
				maxLeft = Math.max(maxLeft, arr[left]);
				water += (maxLeft - arr[left]);
			}

			else {
				right--;
				maxRight = Math.max(maxRight, arr[right]);
				water += (maxRight - arr[right]);
			}
		}

		return water;
	}

	static int rainWaterTrap(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = arr[0];
		for (int i = 1; i < n; i++) {
			left[i] = Math.max(left[i - 1], arr[i]);
		}

		right[n - 1] = arr[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			right[i] = Math.max(right[i + 1], arr[i]);
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			ans = ans + Math.min(left[i], right[i]) - arr[i];
		}

		return ans;
	}

}