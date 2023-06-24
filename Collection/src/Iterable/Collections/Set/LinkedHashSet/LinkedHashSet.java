package Iterable.Collections.Set.LinkedHashSet;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {

	private static Set<String> getLinkedHashSet() {
		java.util.LinkedHashSet<String> lhs1 = new java.util.LinkedHashSet<String>();
		lhs1.add("Ram");
		lhs1.add("Raju");
		lhs1.add("Ravi");
		lhs1.add("Kumar");
		lhs1.add("Rahul");
		lhs1.add("Raju");
		return lhs1;
	}

	public static void main(String[] args) {

		System.out.println(getLinkedHashSet()); // [Ram, Raju, Ravi, Kumar, Rahul]

		java.util.LinkedHashSet lhs2 = (java.util.LinkedHashSet) getLinkedHashSet();
		System.out.println("Size : " + lhs2.size());
		
		
		
		// Iterate the Collection of the LinkedHashSet
		Iterator it = lhs2.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}

	}
	


}
