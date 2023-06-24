package Iterable.Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListUpdate {

	private static LinkedList getLinkedList() {
		LinkedList list1 = new LinkedList();
		list1.add("I");
		list1.add("Love");
		list1.add("Java");
		list1.add("Programming");
		list1.add("Language");
		return list1;
	}

	public static void main(String[] args) {
		
		System.out.println("Original : " + getLinkedList());
		
		// clone of 2 list
		LinkedList list2 = (LinkedList) getLinkedList().clone();
		list2.set(1,"Hate");
		System.out.println("After Update index 1 : " + list2);

	}

}
