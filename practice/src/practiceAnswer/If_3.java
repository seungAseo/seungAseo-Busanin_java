package practiceAnswer;

import java.util.Scanner;

public class If_3 {

	public static void main(String[] args) {
		/*
		2. 정수형 숫자 2개를 Scanner로 입력받아서 두 수를 비교해서 항상 최소값을
		 출력하도록 하세요.
		숫자 2개를 차례로 입력하세요>>> 10 3
		최소값 : 3
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자 2개를 차례로 입력하세요>>> ");
		int number1 = scanner.nextInt();
		int number2 = scanner.nextInt();
		int min = 0;
		
		if(number1 > number2) {
			min = number2;
		} else {	// number1 <= number2
			min = number1;
		}
		System.out.println("최소값 : " + min);
		scanner.close();
	}

}
