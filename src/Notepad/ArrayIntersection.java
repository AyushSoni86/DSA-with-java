import java.util.ArrayList;


public class ArrayIntersection{
	public static void main(String[] args){ 
	int[] arr1 = {1,2,3,4,5,6,7,8,9};
        int[] arr2 = {0,2,4,6,8};
        ArrayList<Integer> duplicates= findIntersection(arr1, arr2);
        System.out.println(duplicates);


	}

	static ArrayList<Integer> findIntersection (int[] arr1, int[] arr2){
		ArrayList<Integer> list = new ArrayList();

		int i = 0, j = 0;
		
		while(i < arr1.length&& j < arr2.length){
			
			if(arr1[i] == arr2[j]){
				list.add(arr1[i]);
				i++;
				j++;
			}
			else if (arr1[i] < arr2[j]) i++;
			else j++;

		}
		return (ArrayList<Integer>)list;
	}



}