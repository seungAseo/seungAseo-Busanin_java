package exercise;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("알파벳 한 문자를 입력하세요>>");
		String s = scanner.next();	// 문자열로 읽음
		char c = s.charAt(0);	// 문자열의 첫번째 문자
		for(char a = 'a'; a <= c; a++) {
			for(char b = a; b <= c; b++) {
				System.out.print(b);
			}
			System.out.println();
		}
		scanner.close();
		/*
		 c = 'b'
		 첫번째 for문 - 'a'~'b'
		 두번째 for문
		 	1. b = 'a'~'b'
		 	2. b = 'b'~'b'
		 	
		 	1. ab
		 	2. b
		 */
	}

}
