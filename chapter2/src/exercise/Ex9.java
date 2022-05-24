package exercise;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하세요>>");
		int number = scanner.nextInt();
		int first = number / 10; // 1~9 - 3, 6, 9
		int second = number % 10; // 1~9 - 3, 6, 9
		
		if(first == 0) {
			first = 1; // 3의 배수가 아닌 임의의 수로 지정
		}
		if(second == 0) {
			second = 1; // 3의 배수가 아닌 임의의 수로 지정
		}
		// first % 3 == 0 - 3의 배수
		if(first % 3 == 0 && second % 3 == 0) {
			System.out.println("박수짝짝");
		} else if((first % 3 == 0 && second % 3 != 0) ||
				  (first % 3 != 0 && second % 3 == 0)) {
			System.out.println("박수짝");
		} else {
			System.out.println("박수없음");
		}
		scanner.close();
	}

}