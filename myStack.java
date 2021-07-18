package StackandQueue;

public class myStack {
	private MyNode top;

	public void push(int element) {
		MyNode node = new MyNode();
		node.key = element;
		node.next = top;
		top = node;

	}

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
}