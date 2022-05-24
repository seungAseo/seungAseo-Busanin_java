package exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		char[] day = {'일', '월', '화', '수', '목', '금', '토'};
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("정수를 입력하세요>>");
			int number;
			try {
				number = scanner.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				scanner.next();		// 입력 토큰을 비움
				continue;
			}
			
			if(number < 0) {
				System.out.println("프로그램 종료합니다...");
				break;
			}
			// 배열 day의 크기로 나눈 나머지를 인덱스로 하여 배열 day에 저장된 문자 출력
			int index = number % day.length;
			System.out.println(day[index]);
		}
		scanner.close();
	}

}
