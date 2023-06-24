package Iterable.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreation {

	public static void main(String[] args) {

		// Way 1
		ArrayList list1 = new ArrayList(); // Directly Create object for Array List
		System.out.println(list1);

		// Way 2
		List list2 = new ArrayList(); // List is an interface so we can use helper class ArrayList
		System.out.println(list2);
		
		// Way 3
		ArrayList<Integer> list3 = new ArrayList<Integer>(); // Only int type data will be added 
		System.out.println(list3);

	}

}
