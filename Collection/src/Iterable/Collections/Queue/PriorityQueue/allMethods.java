package Iterable.Collections.Queue.PriorityQueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class allMethods {

	private static Queue<Integer> getQueue() {
		Queue<Integer> queue1 = new PriorityQueue<Integer>();

		return queue1;
	}

	public static void main(String[] args) {

		// to add element in priority queue
		Queue queue2 = getQueue();
		queue2.add(1);
		queue2.add(2);
		queue2.add(3);
		queue2.add(4);
		queue2.add(5);
		System.out.println("Priority Queue : " + queue2);

		// peek() : to get 1st element of queue
		System.out.println("Top element : " + queue2.peek());

		// poll() : to remove 1st element of queue
		queue2.poll();
		System.out.println("Remove Top element : " + queue2);

		// clear() : to delete all element of queue
		queue2.clear();;
		System.out.println("Remove Top element : " + queue2);
		
		// isEmpty() : to check queue has some elements or not
		System.out.println("Queue is empty :  " + queue2.isEmpty());
		
		Queue queue3 = getQueue();
		queue3.add(1);
		queue3.add(2);
		queue3.add(3);
		queue3.add(4);
		queue3.add(5);
		System.out.println("Does queue have 3 inside it : " +queue3.contains(3));
		
		

	}

}
