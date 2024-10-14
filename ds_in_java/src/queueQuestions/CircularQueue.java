package queueQuestions;

public class CircularQueue {

	private int front;
	private int rear;
	private int nitems;
	private int maxSize;
	
	private int[] queueArray;
	
	public CircularQueue(int maxSize) {
		this.maxSize = maxSize;
		front = 0;
		rear = -1;
		nitems = 0;
		queueArray = new int[maxSize];
		
		
	}
	
	public void insert(int num) {
		if(nitems == maxSize) {
			System.out.println("queue is full");
		}else {
			if(rear == maxSize - 1) {
				rear = -1;
			}
			
			queueArray[++rear] = num;
			nitems++;
		}
	}
	
	
	public int remove() {
		if(nitems == 0) {
			System.out.println("queue is empty");
			return -99;
		}else {
			int temp = queueArray[front++];
			if(front == maxSize) {
				front = 0;
			}
			nitems--;
			return temp;
		}
	}
	
	public boolean isEmpty() {
		return nitems == 0;
	}
	
	public boolean isFull() {
		return nitems == maxSize;
	}
	
	public int peekFront() {
		if(nitems == 0) {
			System.out.println("queue is empty");
			return -99;
		}else {
			return queueArray[front];
		}
	}
	
}
