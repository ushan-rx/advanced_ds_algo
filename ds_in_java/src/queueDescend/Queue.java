package queueDescend;

public class Queue {

	private int max_size;
	private int nItems;
	private char QueueArray[];
	private int front;
	private int rear;
	
	
	public Queue(int max_size) {
		this.max_size = max_size;
		this.QueueArray = new char[max_size];
		this.front = 0;
		this.rear = -1;
		this.nItems = 0;
	}
	
	
	public void insert(char i) {

		if (nItems == max_size) {
			System.out.println("Queue is full");

		} else {

			if (rear == max_size - 1)
				rear = -1;

			QueueArray[++rear] = i;
			nItems++;
		}

	}


	public char remove() {

		if (nItems == 0) {

			System.out.print("Queue is empty");
			return '.';

		} else {
			nItems--;

			char temp = QueueArray[front++];

			if (front == max_size)
				front = 0;

			return temp;

		}
	}	
	
	// 2nd method
	
//	public void insert(char input) {
//		if(rear == max_size -1) {
//			System.out.println("Queue is full");
//		}else {
//			QueueArray[++rear] = input;
//			nItems++;
//		}
//	}
//	
//	public char remove() {
//		if(nItems == 0) {
//			System.out.println("queue is empty");
//			return '\u0000';
//		}else {
//			nItems--;
//			if(nItems == 0) {
//				char temp = QueueArray[front];
//				this.front = 0;
//				this.rear = -1;
//				return temp;
//			}else {
//				return QueueArray[front++];
//			}
//		}
//	}
	
	public char peekFront() {
		if(nItems == 0) {
			System.out.println("queue is empty");
			return '\u0000';
		}else {
			return QueueArray[front];
		}
	}
	
	public boolean isEmpty() {
		if(nItems == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(rear == max_size -1) {
			return true;
		}else {
			return false;
		}
	}
}
