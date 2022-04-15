package OopsConcepts;

public class FibonacciSeriesNumber {
	private static long[] fibonacciCache;

	public static void main(String[] args) 
	{
		int n = 88;
		fibonacciCache = new long[n+1];
		
		for(int i=0;i<=n;i++)
		{
		System.out.print(fibonacci(i)+" ");
		}
	}

	private static long fibonacci(int n) 
	{
		
	//0,1,1,2,3,5,8,13,21,44.......
	//0 and 1 position is fixed
		if(n<=1)
		{
			return n;
		}
		
		if(fibonacciCache[n]!=0)
		{
			return fibonacciCache[n];
		}
		
		long nthfibonacciNumber = fibonacci(n-1)+fibonacci(n-2);
		fibonacciCache[n] = nthfibonacciNumber;
		
		return nthfibonacciNumber;
		
		
		
	}

}
