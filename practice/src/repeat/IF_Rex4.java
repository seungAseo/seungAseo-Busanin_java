package repeat;

import java.util.Scanner;

public class IF_Rex4 {

	public static void main(String[] args) {
		/* if문 예제
		4. 정수형 숫자를 Scanner로 입력받아서 짝수, 홀수를 판별해서 출력하세요.
		숫자를 입력하세요>>> 200
		200은 짝수입니다.
		*/
		Scanner scanner = new Scanner(System.in);
		// 붕어빵틀 붕어빵1 = new 붕어빵틀()
		System.out.println("숫자를 입력하세요.");
		
		int number = scanner.nextInt();
		if( number % 2 == 0) { // 짝수
			System.out.println(number +"은 짝수입니다.");
		} else { // 홀수
			System.out.println(number +"은 홀수입니다.");
		}
		scanner.close();
	}
	// if else와 else 다 사용 가능
}
