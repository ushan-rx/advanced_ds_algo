package queueDescend;

public class SortStack {

	public static void main(String[] args) {
		
		String str = "sssss";
		
		Queue q = new Queue(str.length());
		
		for (char c :str.toCharArray()) {
			q.insert(c);
		}
		
		
		
		StringBuilder strn = new StringBuilder();
		
		
		while(!q.isEmpty()) {
			strn.append(q.remove());
		}
		
		System.out.println(strn.toString());
	}
}


