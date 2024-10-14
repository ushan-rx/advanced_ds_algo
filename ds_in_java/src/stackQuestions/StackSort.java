package stackQuestions;


public class StackSort {
	
	public static void main(String[] args) {
		
		Stack myStack = new Stack(4);
		Stack sortedStack = new Stack(4);
		Stack tempStack = new Stack(4);
		
		myStack.push(56);
		myStack.push(8);
		myStack.push(45);
		myStack.push(11);
		
		
//		for (int i = 0; i < 4; i++) {
//			int current = myStack.pop();
//			while(!myStack.isEmpty()) {
//				if(myStack.peek() < current) {
//					tempStack.push(current);
//					current = myStack.pop();
//				}
//				else {
//					tempStack.push(myStack.pop());
//				}
//			}
//			
//			sortedStack.push(current);
//			while(!tempStack.isEmpty()) {
//				myStack.push(tempStack.pop());
//			}
//			
//		}
//		System.out.println("sorted list:");
//		System.out.print(sortedStack.pop());
//		while(!sortedStack.isEmpty()) {
//			System.out.print("," + sortedStack.pop());
//		}
		
		
		while (!myStack.isEmpty()) {
            int current = myStack.pop();

            // Pop elements from sortedstack and push them back to mystack
            while (!sortedStack.isEmpty() && sortedStack.peek() > current) {
                myStack.push(sortedStack.pop());
            }

            // Push the current element to sortedstack
            sortedStack.push(current);
        }

        // Now sortedstack contains the sorted values in ascending order
        System.out.println("Sorted values in ascending order:");
        while (!sortedStack.isEmpty()) {
            System.out.print(sortedStack.pop() + " ");
        }
		
	}

}
