package Queue;

public class Queue {
	public static void main(String[] args) {
		myQueue queue = new myQueue();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		queue.dequeue();
		queue.display();
	}
}
