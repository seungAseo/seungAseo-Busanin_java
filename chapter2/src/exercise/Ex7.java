package exercise;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("학점을 입력하세요>>");
		String grade = scanner.next();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("Bye");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		
		}
		scanner.close();
	}

}
