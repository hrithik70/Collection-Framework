package Iterable.Collections.List.Vector.Stack;

import java.util.Stack;

public class StackInsert {

	private static Stack getStack() {
		Stack<Integer> stack1 = new Stack<Integer>();
		return stack1;
	}

	public static void main(String[] args) {

		// push() : used to insert element at top(last) of stack
		Stack stack2 = getStack();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		stack2.push(4);
		stack2.push(5);
		stack2.push(6);
		System.out.println(stack2);
		
		
		
		

	}

}
