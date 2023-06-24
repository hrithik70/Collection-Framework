package Iterable.Collections.Set.HashSet;

import java.util.HashSet;

public class HashSetRemove {

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

		// after remove 40 as element
		HashSet hashSet2 = getHashSet();
		hashSet2.remove(40);
		System.out.println(hashSet2);

		// after all element
		HashSet hashSet3 = getHashSet();
		hashSet3.removeAll(getHashSet());
		System.out.println(hashSet3);
		
		// isEmpty()
		System.out.println("Hash Set 3 is empty ? : " + hashSet3.isEmpty());

	}

}
