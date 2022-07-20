package practice;

import java.util.*;

public class collectionFramework {
	public static void main(String[] args) {
		//ArrayList
		System.out.println("*****Array List*****");
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Mango");

		System.out.println(fruits);

		// vector
		System.out.println("*****Vector*****");
		Vector<Integer> Numbers = new Vector();
		Numbers.addElement(17);
		Numbers.addElement(90);
		Numbers.addElement(28);

		System.out.println(Numbers);
		
		
		//Hash set
				System.out.println("*****Has Set*****");
				HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);

	}
}
