package Iterable.Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListDelete {

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
		System.out.println("Original List : " + getLinkedList()); // [I, Love, Java, Programming, Language]

		// to delete all the elements of linked List
		LinkedList list2 = getLinkedList();
		list2.clear();
		System.out.println("Empty list : " + list2); // Empty list : []

		// to delete the elements of linked List via index
		LinkedList list3 = getLinkedList();
		list3.remove(3);
		System.out.println("After removing 3rd index from list : " + list3); // After removing 3rd index from list : [I,
																				// Love, Java, Language]

		// to delete head element of linked List
		LinkedList list4 = getLinkedList();
		list4.removeFirst();
		System.out.println("Head Remove from list : " + list4); // Head Remove from list : [Love, Java, Programming,
																// Language]

		// to delete tail element of linked List
		LinkedList list5 = getLinkedList();
		list5.removeLast();
		System.out.println("Tail Remove from list : " + list5); // Tail Remove from list : [I, Love, Java, Programming]
	}

}
