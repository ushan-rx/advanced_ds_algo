package stackQuestions;


public class DeleteStackMiddle {
	
	public static void main(String[] args) {
		
		Stack s = new Stack(6);
		Stack s1 = new Stack(6);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		
		int length = 0;
		while(!s.isEmpty()) {
			s1.push(s.pop());
			length++;
		}
		for (int i = 0; i < length; i++) {
			if(i == length/ 2) {
				s1.pop();
			}else {
				s.push(s1.pop());
			}
		}
		// for test the output only
		while(!s.isEmpty()) {
			System.out.print(s.pop() + ", ");
		}
	}

}
