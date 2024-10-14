package CircularQueue;

public class CircukarQueInt {

	
	int max_size;
	int front, rear;
	int queueArray[];
	int nItems;
	
	
	public CircukarQueInt(int max_size) {
		this.max_size = max_size;
		this.nItems = 0;
		this.queueArray = new int[max_size];
		this.front = 0;
		this.rear = -1;
	}
	
	public void insert(int c) {
		if(nItems == max_size) {
			System.out.println("Queue is full");
			return;
		}else {
			if(rear == max_size -1) {
				rear = -1;
			}
			queueArray[++rear] = c;
			nItems++;
			
		}
	}
	
	public int remove() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return '\u0000';
		}else {
			int temp = queueArray[front++];
			if(front == max_size) {
				front = 0;
			}
			nItems--;
			return temp;
		}
	}
	
	public int peekFront() {
		if(nItems == 0) {
			System.out.println("Queue is empty");
			return '\u0000';
		}else {
			return queueArray[front];
		}
	}
	
	public boolean isEmpty() {
		return nItems == 0;
	}
	
	
	public boolean isEnd() {
		return front == max_size -1;
	}
}
