package queueQuestions;

import stackQuestions.Stack;

public class StackQueue {

	Stack s1;
	Stack s2;

	public StackQueue(int size) {
		s1 = new Stack(size);
		s2 = new Stack(size);
	}

	public void insert(int num) {
		if (s1.isFull()) {
			System.out.println("queue is full");
		} else {
			s1.push(num);
		}
	}

	public int remove() {

		if (s2.isEmpty()) {
			while (!s1.isEmpty()) {
				s2.push(s1.pop());
			}
		}
		return s2.pop();
	}
}
