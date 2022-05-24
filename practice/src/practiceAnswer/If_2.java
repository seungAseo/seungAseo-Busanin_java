package practiceAnswer;

import java.util.Scanner;

public class If_2 {

	public static void main(String[] args) {
		/*
		2. 정수형 숫자 2개를 Scanner로 입력받아서 두 수를 비교해서 항상 최대값을
		 출력하도록 하세요.
		숫자 2개를 차례로 입력하세요>>> 10 3
		최대값 : 10
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개를 차례로 입력하세요>>> ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int max = 0;
		
		if(number1 > number2) {
			max = number1;
		} else {	// number1 <= number2
			max = number2;
		}
		System.out.println("최대값 : " + max);
		scanner.close();
	}

}
