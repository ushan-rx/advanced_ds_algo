package CircularQueue;

public class Stack {

	int top, max_size;
	char stackArray[];
	
	public Stack(int max_size) {
		super();
		this.max_size = max_size;
		this.stackArray = new char[max_size];
		this.top = -1;
	}
	
	public void push(char c) {
		if(top == max_size - 1) {
			System.out.println("Stack is full");
		}else {
			stackArray[++top] = c;
		}
	}
	
	public char pop() {
		if(top == -1) {
			System.out.println("stack is empty");
			return '\u0000';
		}else {
			return stackArray[top--];
		}
	}
	
	public char peek() {
		if(top == -1) {
			System.out.println("stack is empty");
			return '\u0000';
		}else {
			return stackArray[top];
		}
	}
	
	
	public boolean isEmpty() {
		return top == -1;
	}
	
}
