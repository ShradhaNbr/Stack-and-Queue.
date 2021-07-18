package StackandQueue;

public class myStack {
	private MyNode top;

	/*
	 * purpose : Method to push elements into the stack
	 * 
	 * @param : element
	 */
	public void push(int element) {
		MyNode node = new MyNode();
		node.key = element;
		if (node == null)
			node.next = null;
		else {
			node.next = top;
			top = node;
		}

	}

	// Method to display the stack
	public void display() {
		MyNode tempNode = top;
		if (top == null)
			System.out.println("Stack empty");
		else {
			System.out.println("Stack List");
			while (tempNode != null) {
				System.out.println(tempNode.key);
				tempNode = tempNode.next;
			}
		}
	}

// Method to return top element
	public int peek() {
		return top.key;
	}

// Method to pop the top element
	public void pop() {
		if (top == null)
			System.out.println("Stack empty");
		else {
			MyNode temp = top;
			System.out.println("Popped out element is " + temp.key);
			top = top.next;
		}

	}

}