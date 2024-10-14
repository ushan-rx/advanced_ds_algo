package linkedListQuestions;

public class Link {
	
	int iData;
	Link next;
	
	public Link(int data) {
		iData = data;
		next = null;
	}
	
	public void display() {
		System.out.println(iData);
	}

}
