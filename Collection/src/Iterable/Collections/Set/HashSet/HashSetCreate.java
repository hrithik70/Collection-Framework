package Iterable.Collections.Set.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetCreate {

	private static HashSet<Integer> getHashSet() {
		HashSet<Integer> hashSet1 = new HashSet<Integer>();
		hashSet1.add(10);
		hashSet1.add(20);
		hashSet1.add(30);
		hashSet1.add(40);
		hashSet1.add(50);
		return hashSet1;
	}

	public static void main(String[] args) {

		System.out.println("HashSet : " + getHashSet());
		System.out.print("Elements of HashSet are : ");
		Iterator it = getHashSet().iterator();
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
