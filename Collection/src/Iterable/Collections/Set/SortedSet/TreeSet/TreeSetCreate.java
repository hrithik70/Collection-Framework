package Iterable.Collections.Set.SortedSet.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCreate {

	private static TreeSet<String> getTreeSet() {
		Set<String> trs1 = new TreeSet<String>();
		trs1.add("Java");
		trs1.add("HTML");
		trs1.add("CSS");
		trs1.add("JavaScript");
		trs1.add("J2EE");
		return (TreeSet<String>) trs1;

	}

	public static void main(String[] args) {
		
		System.out.println(getTreeSet());

	}

}
