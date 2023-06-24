package Iterable.Collections.List.Vector.Stack;

import java.util.Stack;

public class StackFetch {

	private static Stack getStack() {
		Stack<Integer> stack1 = new Stack<Integer>();
		stack1.push(1);
		stack1.push(2);
		stack1.push(3);
		stack1.push(4);
		stack1.push(5);
		return stack1;
	}

	public static void main(String[] args) {
		
		System.out.println(getStack());
		
		// peek() : fetch 1st element(Top) of stack
		System.out.println("Top element of stack : " + getStack().peek());

	}

}
