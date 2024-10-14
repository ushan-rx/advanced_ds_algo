package queueDescend;

public class Stack {
	
	private int max_size;
	private char stackArray[];
	private int top;
	
	public Stack(int max_size) {
		this.max_size = max_size;
		this.stackArray = new char[max_size];
		this.top = -1;
	}
	
	
	public void push(char character) {
		if(top == max_size -1 ) {
			System.out.println("stack is full");
		}else {
			stackArray[++top] = character;
		}
	}
	
	public char pop() {
		if(top == -1) {
			return '\u0000';
		}else {
			return stackArray[top--];
		}
	}

	
	public char peek() {
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
