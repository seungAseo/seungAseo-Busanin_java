package exercise;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("두 정수를 입력하세요 >> ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int sum = num1 + num2;
		
		System.out.println(num1 + "+" + num2 + "은 " + sum);
     //	System.out.println(num1 + "+" + num2 + "은 " + (num1 + num2));
		
		scanner.close();
	}

}
