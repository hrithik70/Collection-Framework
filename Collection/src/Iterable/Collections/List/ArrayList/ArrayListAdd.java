package Iterable.Collections.List.ArrayList;

import java.util.ArrayList;

public class ArrayListAdd {

	public static void main(String[] args) {

		ArrayList list1 = new ArrayList();

		// way 1 : add(element)
		list1.add(1);

		// way 2 : add(index,element)
		list1.add(1, "Ram");

		System.out.println(list1);

		// way 3 : addAll(collection)
		ArrayList list2 = new ArrayList();
		list2.add("Hrithik");
		list2.addAll(list1);
		System.out.println(list2);

	}

}
