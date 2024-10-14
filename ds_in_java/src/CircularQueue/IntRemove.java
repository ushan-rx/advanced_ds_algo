package CircularQueue;

import java.util.Scanner;

import queueDescend.StackInt;

public class IntRemove {
	
	public static void main(String[] args) {
		
		CircukarQueInt queue = new CircukarQueInt(6);
		
        Scanner scanner = new Scanner(System.in);

        // Input phase: Pushing elements into the stack
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 6; i++) {
            int inputNum = scanner.nextInt();
            queue.insert(inputNum);              
        }
        
        while(!queue.isEnd()) {         // until front comes to the last element
        	int temp = queue.remove();  // remove from front
        	queue.insert(temp);         // insert to the start end (rear)
        }
        
        queue.remove();      // remove last element from queue
        
        System.out.println("After: \n");
        while(!queue.isEmpty()) {
        	System.out.println(queue.remove());
        }
        
	}

}
