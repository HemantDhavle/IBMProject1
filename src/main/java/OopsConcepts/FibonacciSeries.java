package OopsConcepts;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int n = 6;
		
		System.out.println(Fibonacci(n));

	}

	private static long Fibonacci(int n) 
	{
		if(n<=1)
		{
			return n;
		}
		return (Fibonacci(n-1)+Fibonacci(n-2));
	
		
	}

}
