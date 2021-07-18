package StackandQueue;

public class Stack {
	public static void main(String[] args) {
		myStack stack = new myStack();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.peek();
		stack.pop();
		stack.display();
	}
}