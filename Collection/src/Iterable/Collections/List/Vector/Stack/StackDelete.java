package Iterable.Collections.List.Vector.Stack;

import java.util.Stack;

public class StackDelete {

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
		
		//original Stack
		System.out.println("Original Stack : " + getStack());

		// pop() : used to delete element at top of stack
		Stack stack2 = getStack();
		stack2.pop();
		System.out.println(stack2);

	}

}
