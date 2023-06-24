package Iterable.Collections.List.LinkedList;

import java.util.LinkedList;

public class LinkedListMiscelleneous {

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

		System.out.println("Original List : " + getLinkedList());

		// contains() used to check element present in list or not
		LinkedList list2 = getLinkedList();
		System.out.println(list2.contains("Java")); // True

		// get(int index) used to check element using index as arguement
		LinkedList list3 = getLinkedList();
		System.out.println(list3.get(4)); // Language

		// getFirst(int index) used to check element using index as arguement
		LinkedList list4 = getLinkedList();
		System.out.println("Head : " + list4.getFirst()); // Head : I

		// getLast(int index) used to check element using index as arguement
		LinkedList list5 = getLinkedList();
		System.out.println("Tail : " + list5.getLast()); // Language
		
		// change linked list to array
		Object[] array1 = getLinkedList().toArray();
		System.out.print("Linked List to Array Elements : ");
		for(Object obj : array1)
		{
			System.out.print(obj + " ");
		}
		
	

	}

}
