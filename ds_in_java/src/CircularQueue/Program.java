package CircularQueue;

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		// if method 1
		
		// get values from user in descending order and store in queue
		// then get values from the queue and continue
		
		int MAX_SIZE = 10;
		
		Scanner sc = new Scanner(System.in);
		
		CircleQueue queue = new CircleQueue(MAX_SIZE);
		Stack stck1 = new Stack(MAX_SIZE/2);
		Stack stck2 = new Stack(MAX_SIZE/2);
		
		System.out.println("Enter the characters in descending order");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Character "+(i+1)+":");
			queue.insert(sc.next().toCharArray()[0]);   //insert values descending
		}
		
		sc.close();
			
		while(!queue.isEmpty()) {
			stck1.push(queue.remove());        // insert into stack1
		}
		
		while(!stck1.isEmpty()) {
			char temp = stck1.pop();
			stck2.push(temp);          // insert to second queue
			queue.insert(temp);        // insert to queue  (reversed)
		}
		
		while(!stck2.isEmpty()) {
			queue.insert(stck2.pop());   // insert from 2nd stack (descending)
		}
		
		System.out.println("After");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.remove());
		}

		
	}

}
