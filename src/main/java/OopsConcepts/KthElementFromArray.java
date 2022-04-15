package OopsConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class KthElementFromArray {

	public static Integer sortArray(int k, Integer[] arr)
	{
		Arrays.sort(arr);
		return arr[k-1];
	}
	
	public static void main(String[] args) 
	{
		Integer[] arr = new Integer[] {3,4,1,40,33,5,2};
		int k = 6;
		System.out.println("kth smallest " +sortArray(k, arr));
		
	}

}
