import java.util.*;

public class AddArrays{
	public static void main(String[] args){
		ArrayList<Integer> arr1 = new ArrayList();
		ArrayList<Integer> arr2 = new ArrayList();
		ArrayList<Integer> arr3 = new ArrayList();

		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);

		arr2.add(3);

		arr3 = addArray(arr1,arr2);

		System.out.println(arr3);


	}

	static ArrayList<Integer> addArray (ArrayList<Integer> arr1, ArrayList <Integer> arr2){
		int i = arr1.size() - 1, j = arr2.size() - 1;
		int carry = 0;
		ArrayList<Integer> ans = new ArrayList();

		while(i >= 0 && j >= 0){
			int val1 = arr1.get(i);
			int val2 = arr2.get(j);

			int sum = val1 + val2 + carry;
			carry = sum / 10;
			sum = sum % 10;
			ans.add(sum);
			i--;
			j--;			


		}


		while(i >= 0){
			int sum = arr1.get(i) + carry;
			carry = sum / 10 ; 
			sum = sum % 10;
			ans.add(sum);
			i--;
		}

		
		while(j >= 0){
			int sum = arr2.get(j) + carry;
			carry = sum / 10 ; 
			sum = sum % 10;
			ans.add(sum);
			j--;
		}

		while(carry != 0){
			int sum = carry;
			carry = sum / 10;
			sum = sum % 10;
			ans.add(sum);				

		}
		return ans;
	}

}