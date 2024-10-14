package queueQuestions;

public class QueueMain {
	
	public static void main(String[] args) {
		
		StackQueue q1 = new StackQueue(5);
		
		q1.insert(1);
		q1.insert(2);
		q1.insert(3);
		q1.insert(4);
		q1.insert(5);
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		q1.insert(1);
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
		System.out.println(q1.remove());
	}

}
