package Queue;

public class myQueue {
	MyNode front;
	MyNode rear;

	public void enqueue(int element) {
		MyNode node = new MyNode();
		node.key = element;
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.next = node;
			rear = node;
		}
	}

	void display() {
		if (front == null)
			System.out.println("Queue is empty");
		else {
			MyNode temp = front;
			System.out.println("Queue list");
			while (temp != null) {
				System.out.println(temp.key);
				temp = temp.next;
			}
		}
	}

	public void dequeue() {
		if (front == null)
			System.out.println("Queue Underflow");
		else {
			MyNode temp = front;
			System.out.println("Dequeued element is " + temp.key);
			front = front.next;
		}

	}
}
