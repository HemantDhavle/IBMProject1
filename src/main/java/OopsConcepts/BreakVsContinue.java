package OopsConcepts;

import java.util.HashMap;

public class BreakVsContinue 
{
	public static void main(String args[])
	{
////		for(int i = 0;i<=10 ; i++)
////		{
////			System.out.println(i);
////			if(i==4)
////			break;
////		}
//
//		for(int j = 0;j<=10 ; j++)
//		{	
//			if(j<=4)
//			continue;
//			System.out.println(j);
//		}

		HashMap<String, String> hm =new HashMap<String, String>();
		hm.put("1", "hemant1");
		hm.put("2", "hemant2");
		hm.forEach((k,v) -> System.out.print(k+"asda"+v));
		
		
	}

}
