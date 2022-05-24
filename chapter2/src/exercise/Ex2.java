package exercise;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("몇 층인지 입력하세요 >>");
		int floor = scanner.nextInt();
		
		System.out.println((floor * 5) + "m 입니다.");
		
		scanner.close();
	}

}
