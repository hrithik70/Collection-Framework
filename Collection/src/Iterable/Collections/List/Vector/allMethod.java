package Iterable.Collections.List.Vector;

import java.util.Vector;

public class allMethod {

	private static Vector<Integer> getVector() {
		Vector<Integer> obj1 = new Vector<Integer>();
		obj1.add(5);
		obj1.add(4);
		obj1.add(36);
		obj1.add(7);
		obj1.add(45);
		obj1.add(24);
		obj1.add(1);
		return obj1;
	}

	public static void main(String[] args) {

		// elementAt(int index) : gives element of index argumented
		System.out.println(getVector().elementAt(3)); // 7

		// firstElement() : gives first element of Vector
		System.out.println(getVector().firstElement()); // 5

	}

}
