package ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroHandling2 {
	
	public static void main(String[] args) {
		// while문으로 무한반복
		// -1을 입력하면 while문 종료
		/*
		정수 외에 입력값을 받았을 경우 '숫자가 아닙니다'를 출력하고 계속 진행
		(예외처리) -> InputMismatchException
		*/
		Scanner scanner = new Scanner(System.in);
		int dividend;	// 나뉨수
		int divisor;	// 나눗수
		
		while(true) {
			System.out.print("나뉨수를 입력하세요(-1은 종료):");
			dividend = scanner.nextInt();	// 나뉨수 입력
			if(dividend == -1) {
				System.out.println("종료");
				break;
			}
			System.out.print("나눗수를 입력하세요(-1은 종료):");
			divisor = scanner.nextInt();	// 나눗수 입력
			if(divisor == -1) {
				System.out.println("종료");
				break;
			}
			
			try {
				System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " +
						dividend / divisor + "입니다.");
			} catch(ArithmeticException e) { // ArithmeticException 예외 처리 코드
				System.out.println("0으로 나눌 수 없습니다.");
			} catch(InputMismatchException e) { // InputMismatchException 예외 처리 코드
				System.out.println("숫자가 아닙니다.");
				scanner.next();		// 입력된 토큰을 비움
			}	
		}
		scanner.close();
	}
		
}
