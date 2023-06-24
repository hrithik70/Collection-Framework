package Iterable.Collections.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMissleneous {

	public static List<Integer> getList() {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		return list1;
	}

	public static void main(String[] args) {

		// Contains() : check specified element present or not
		System.out.println(getList().contains(5)); // true

		// isEmpty() : to check list has some elements or not
		System.out.println(getList().isEmpty()); // false

		// equals() : checks wheather two lists have same elements or not
		System.out.println(getList().equals(getList())); // true
	}

}
