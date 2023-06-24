package Iterable.Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListUpdate {
	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		System.out.println(list1);

		// to Update arrayList : set(index,element)
		list1.set(2, 69);
		System.out.println("After updating index 2 with 69 as element");
		System.out.println(list1);

	}

}
