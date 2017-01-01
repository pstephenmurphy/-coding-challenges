package coding.challenges;

import java.util.Scanner;
import java.util.Stack;

public class Solution<T> {

	private MyQueue myQueue;

	public Solution() {
		myQueue = new MyQueue();
	}

	public class MyQueue {
		Stack<T> stackNewestOnTop = new Stack<T>();
		Stack<T> stackOldestOnTop = new Stack<T>();

		public void enqueue(T value) { // Push onto newest stack
			stackNewestOnTop.push(value);
		}

		public T peek() {
			copyNewToOld();
			return stackOldestOnTop.peek();
		}

		public T dequeue() {
			copyNewToOld();
			return stackOldestOnTop.pop();
		}

		private void copyNewToOld() {
			if (stackOldestOnTop.isEmpty()) {
				while (!stackNewestOnTop.isEmpty()) {
					T value = stackNewestOnTop.pop();
					stackOldestOnTop.push(value);
				}
			}
		}
	}

	public void enqueue(T value) { // Push onto newest stack
		myQueue.enqueue(value);
	}

	public T peek() {
		return myQueue.peek();
	}

	public T dequeue() {
		return myQueue.dequeue();
	}

	public static void main(String[] args) {
		Solution<Integer> solution = new Solution<Integer>();

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			int operation = scan.nextInt();

			switch (operation) {
			case 1: // enqueue
				solution.enqueue(scan.nextInt());
				break;
			case 2: // dequeue
				solution.dequeue();
				break;
			case 3: // print/peek
				System.out.println(solution.peek());
				break;
			}
		}
		scan.close();
	}
}
