package Iterable.Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListInsertion {

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
		
		
		// Your List 
		System.out.println(getLinkedList());  // [I, Love, Java, Programming, Language]

		// addFirst() : used to add at first index of any linked list

		LinkedList list2 = getLinkedList();
		list2.addFirst("Hrithik");
		System.out.println(list2); // [Hrithik, I, Love, Java, Programming, Language]

		// addLast() : used to add at last index of any linked list

		LinkedList list3 = getLinkedList();
		list3.addLast("Raj");
		System.out.println(list3); // [I, Love, Java, Programming, Language, Raj]
		

		

	}

}
