package practiceAnswer;

import java.util.Scanner;

public class If_4 {

	public static void main(String[] args) {
		/*
		4. 정수형 숫자를 Scanner로 입력받아서 짝수, 홀수를 판별해서 출력하세요.
			숫자를 입력하세요>>> 200
			200은 짝수입니다.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>> ");
		
		int number = scanner.nextInt();
		
		if(number % 2 == 0) {	// 짝수
			System.out.println(number + "은 짝수입니다.");
		} else {				// 홀수
			System.out.println(number + "은 홀수입니다.");
		}
		scanner.close();
	}

}
