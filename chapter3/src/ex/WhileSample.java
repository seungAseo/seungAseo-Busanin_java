package ex;

import java.util.Scanner;

public class WhileSample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, n =0;	// count는 입력되는 수의 개수
		double sum = 0;
		
		System.out.println("정수를 입력하고 마지막에 0을 입력하세요.");
		while((n = scanner.nextInt()) != 0) {
			sum = sum + n;
			count++;
		}
		/* n = 10, 0과 같지 않으니 실행문 밑에 실행문 실행, 
		 * sum = 0 + 10, sum = 10, count= 1
		 * n = 30, sum = 10 + 30, sum = 40, count = 2
		 * n = -20, sum = 40 + (-20), sum = 20, count = 3
		 * n = 40, sum = 20 + 40, sum = 60, count = 4
		 * n = 0
		 */
		System.out.print("수의 개수는 " + count + "개이며");
		System.out.println("평균은 " + sum/count + "입니다.");
		
		scanner.close();
	}

}
