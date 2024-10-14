package queueQuestions;

public class Queue {
	
	private int front;
	private int rear;
	private int nItems;
	private int maxSize;
	private double[] queueArray;
	
	public Queue(int maxSize) {
		this.maxSize = maxSize;
		nItems = 0;
		queueArray = new double[maxSize];
		front = 0;
		rear = -1;
	}
	
	public void insert(double num) {
		if(rear == maxSize-1) {
			System.out.println("queue is full");
		}else {
			queueArray[++rear] = num;
			nItems++;
		}
	}
	
	public double remove() {
		if(nItems == 0) {
			System.out.println("queue is empty");
			return -99;
		}else {
			nItems--;
			return queueArray[front++];
		}
	}
	
	public double peekFront() {
		if(nItems == 0) {
			System.out.println("queue is empty");
			return -99;
		}else {
			return queueArray[front];
		}
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	public boolean isFull() {
		return nItems == maxSize;
	}

}
