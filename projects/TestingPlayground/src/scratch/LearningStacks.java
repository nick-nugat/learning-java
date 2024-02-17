package scratch;

import java.util.Stack;

public class LearningStacks {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(5);
		stack.push(0);

		System.out.println(stack.pop());

		stack.pop();

		System.out.println(stack.pop());
	}
}
