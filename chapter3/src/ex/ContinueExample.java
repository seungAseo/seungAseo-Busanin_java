package ex;

import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum = 0;
		for(int i = 1; i <= 5; i++) {
			int n = scanner.nextInt(); // 키보드에서 정수 입력
			if(n < 0) {		// 0이나 음수인 경우 더하지 않고 다음 반복으로 진행
				continue;
			} else {		// 양수인 경우 덧셈
				sum += n;
			}
		}
		System.out.println("양수의 합은 " + sum);
		scanner.close();
	}

}
