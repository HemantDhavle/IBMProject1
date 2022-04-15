package OopsConcepts;

public class StringSplit {

	public static void main(String[] args) {
		String order = "ORDER # 407-4816420-7266712";
		
		String[] or = order.split("#");
		String name1 = or[0].trim();
		String name2 = or[1].trim();
		System.out.println(name1);
		
		String[] ornumber= name2.split("-");
//		String or1 = ornumber[0].trim();
//		String or2 = ornumber[1].trim();
//		String or3 = ornumber[2].trim();
//		String or4 = ornumber[3].trim();
//		System.out.println(or1);
//		System.out.println(or2);
//		System.out.println(or3);
//		System.out.println(or4);
		for(String e : ornumber)
		{
			System.out.println(e);
		}
	}

}
