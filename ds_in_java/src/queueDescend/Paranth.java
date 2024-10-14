package queueDescend;

import java.util.Scanner;

public class Paranth {

	public static void main(String[] args) {
		
		int size = 100;
		Stack stk = new Stack(size);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter expression: ");
		
		String input = sc.next();
		
		sc.close();
		
		
		
		char exp[] = input.toCharArray();
		
		for (char c : exp) {
			if(c == '(') {
				stk.push(c);
			}else if(c == ')') {
				stk.pop();
			}
		}
		
		if(stk.isEmpty()) {
			System.out.println("correct");
		}else {
			System.out.println("not correct");
		}
	}
}
