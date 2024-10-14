package queueDescend;

import java.util.Scanner;

public class QueueDescend {

	
	public static void main(String[] args) {
		int MAX_SIZE = 5;
		
		Queue charQ = new Queue(MAX_SIZE);
		Stack charStack = new Stack(MAX_SIZE);
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter characters in ascending order ");
		for (int i = 0; i < MAX_SIZE; i++) {
			System.out.println("Character " + (i+1) + ":");
			charQ.insert(sc.next().toCharArray()[0]);	    // insert char to queue
		}
		
		sc.close();
		
		while (!charQ.isEmpty()) {          // move items to stack
			charStack.push(charQ.remove());
		}
		
		while(!charStack.isEmpty()) {       // return items to queue from stack (reversed)
			charQ.insert(charStack.pop());
		}
		
		System.out.println("\nDescending order :");
		
		while (!charQ.isEmpty()) {           // remove and display queue
			System.out.println(charQ.remove());
		}
	}
}
