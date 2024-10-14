package queueDescend;

import java.util.Scanner;

public class StackGreater {
		
	public static void main(String[] args) {
		
        StackInt stack = new StackInt(5);
        StackInt temp = new StackInt(5);
        
        Scanner scanner = new Scanner(System.in);
        
        // Input phase: Pushing elements into the stack
        System.out.println("Enter 5 numbers:");
        
        for (int i = 0; i < 5; i++) {
            int inputNum = scanner.nextInt();
            temp.push(inputNum);               // temporarily store in temp stack
        }
        
        System.out.println("values: ");
        
        while(!temp.isEmpty()) {
        	System.out.print(temp.peek()+ ", ");
        	stack.push(temp.pop()); // store elements in correct order for operation
        }
        
        
        // Finding next greater elements and printing the result
        System.out.println("\nNext Greater Elements:");
        
        
//		for (int i = 0; i < 5; i++) {
//		    int currentNum = stack.pop();
//		    int nextGreater = -1;
//		    
//		    while (!stack.isEmpty() && stack.peek() <= currentNum) {
//		        temp.push(stack.pop()); // Pop elements smaller than currentNum
//		    }
//		    
//		    if (!stack.isEmpty()) {
//		        nextGreater = stack.peek(); // The top of stack is the next greater element
//		    }
//		    
//		    System.out.println(currentNum+": "+nextGreater);
//		    
//		    while(!temp.isEmpty())
//		    	stack.push(temp.pop()); // Restore the popped element
//		 
//		 }
        
        
        //sort stack to temp
        
        while(!stack.isEmpty()) {
        	int current = stack.pop();
        	
        	while(!temp.isEmpty() && temp.peek() < current) {
        		stack.push(temp.pop());
        	}
        	
        	temp.push(current);
        }
        
        while(!temp.isEmpty()) {
        	System.out.println(temp.pop() + " : " + temp.peek());
        }
        
		 
	}
	
}

