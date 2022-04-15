package OopsConcepts;

public class LargestElementInArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {3,67,1,40,33,69,98};
		int max = arr[0];
		
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(max);

	}

}
