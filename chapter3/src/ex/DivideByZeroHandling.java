package ex;

import java.util.Scanner;

public class DivideByZeroHandling {
	
	public static void main(String[] args) {
		
		// 자바의 예외 클래스 - 정수를 0으로 나눌때
		// ArithmeticException 오류가 발생한다.
		
		Scanner scanner = new Scanner(System.in);
		int dividend;	// 나뉨수
		int divisor;	// 나눗수
		
		System.out.print("나뉨수를 입력하세요:");
		dividend = scanner.nextInt();	// 나뉨수 입력
		System.out.print("나눗수를 입력하세요:");
		divisor = scanner.nextInt();	// 나눗수 입력
		
		try {
			System.out.println(dividend + "를 " + divisor + "로 나누면 몫은 " +
					dividend / divisor + "입니다.");
		} catch(ArithmeticException e) { //ArithmeticException 예외 처리 코드
			System.out.println("0으로 나눌 수 없습니다.");
		} finally {
			scanner.close();
		}
		
	}

}
