package stackQuestions;

public class Stack {
	
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new int[maxSize];
		top = -1;
	}
	
	public void push(int num) {
		if(top == maxSize-1) {
			System.out.println("stack is full");
		}else {
			stackArray[++top] = num;
		}
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("stack is empty");
			return -99;
		}else {
			return stackArray[top--];
		}
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("stack is empty");
			return -99;
		}else {
			return stackArray[top];
		}
	}
	
	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == maxSize-1;
	}
	
}
