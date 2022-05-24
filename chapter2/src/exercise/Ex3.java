package exercise;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("x 값을 입력하세요>>");
		int x = scanner.nextInt();
		int y = (x*x) - (3*x) + 7;
		// Math.pow(2, 3) = 2의 3승
		System.out.println("x=" + x + ", y=" + y);
		
		scanner.close();
	}

}
