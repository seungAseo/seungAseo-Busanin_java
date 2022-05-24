package exercise;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("논리 연산을 입력하세요>>");
		boolean a = scanner.nextBoolean(); // 첫번째 논리값 읽기
		String op = scanner.next(); // 논리 연산자(AND 또는 OR)를 문자열로 읽기
		boolean b = scanner.nextBoolean(); // 두번째 논리값 읽기
		boolean result = false;
		
		switch(op) {
			case "AND":
				result = a && b;
				break;
			case "OR":
				result = a || b;
				break;
			default:
					System.out.println("잘못된 논리 연산자입니다.");
		}
		System.out.println(result);
		scanner.close();
	}

}
