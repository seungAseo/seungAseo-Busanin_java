package practiceAnswer;

import java.util.Scanner;

public class If_1 {

	public static void main(String[] args) {
		/* 1. 정수형 숫자를 Scanner로 입력받아서 해당 숫자의 절대값을 구하세요.
		숫자를 입력하세요>>> -5
		절대값 : 5
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요>>>");
		int number = scanner.nextInt();
		
		if(number < 0) {
			System.out.println("절대값 : " + -number);
			// number * -1, number * (-1)
		}
		scanner.close();
	}

}
