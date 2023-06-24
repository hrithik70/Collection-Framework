package Iterable.Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListDelete {

	public static void main(String[] args) {
		ArrayList list1 = new ArrayList();
		list1.add(1);
		list1.add(22);
		list1.add(33);
		list1.add(44);
		list1.add(55);
		System.out.println(list1);

		// Way 1 : remove(index);
		list1.remove(1);
		System.out.println("After Removing index 1");
		System.out.println("List 1 : " + list1);

		// Way 2 : clear all list
		list1.clear();
		System.out.println("After Removing all");
		System.out.println("List 1 : " + list1);
		
	
		
		
		

	}

}
