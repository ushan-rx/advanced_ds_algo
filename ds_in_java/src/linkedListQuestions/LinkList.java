package linkedListQuestions;

public class LinkList {
	
	private Link first;
	
	public void insertFirst(int val) {
		Link newLink = new Link(val);
		newLink.next = first;
		first = newLink;
	}
	
	public void insert(int loc, int val) {
		Link current = first;
		while(current != null) {
			if(current.iData == loc) {
				Link newLink = new Link(val);
				newLink.next = current.next;
				current.next = newLink;
				break;
			}
			current = current.next;
		}
		
	}
	
	public Link deleteFirst() {
		Link temp = first;
		first = first.next;
		return temp;
	}
	
	public Link delete(int val) {
		Link current = first;
		Link prev = null;
		while(current != null) {
			if(current.iData == val) {
				if(current == first) {
					first = first.next;
				}else {
					prev.next = current.next;
				}
				return current;
			}
			prev = current;
			current = current.next;
		}
		return null;
	}
	
	public void display() {
		Link current = first;
		while(current != null) {
			current.display();
			current = current.next;
		}
		System.out.println(" ");
	}
	
	public Link find(int val) {
		Link current = first;
		while(current != null) {
			if(current.iData == val) {
				return current;
			}
			current = current.next;
		}
		return null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void deleteAllLinks() {
		while(first != null) {
			System.out.print(first.iData + " ");
			first = first.next;
		}
	}
	
	public void deleteExceptLast() {
		while(first.next != null) {
			System.out.print(first.iData + " ");
			first = first.next;
		}
	}
	
	public void deleteLast() {
		Link temp = first;
		while(temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;
	}

}
























