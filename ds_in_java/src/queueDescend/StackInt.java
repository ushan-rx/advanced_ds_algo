package queueDescend;

public class StackInt {

	private int max_size;
	private int stackArray[];
	private int top;
	
	public StackInt(int max_size) {
		this.max_size = max_size;
		this.stackArray = new int[max_size];
		this.top = -1;
	}
	
	
	public void push(int i) {
		if(top == max_size -1 ) {
			System.out.println("stack is full");
		}else {
			stackArray[++top] = i;
		}
	}
	
	public int pop() {
		if(top == -1) {
			return '\u0000';
		}else {
			return stackArray[top--];
		}
	}

	
	public int peek() {
		if(top == -1) {
			return '\u0000';
		}else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean isFull() {
		if(top == max_size -1) {
			return true;
		}else {
			return false;
		}
	}
}
