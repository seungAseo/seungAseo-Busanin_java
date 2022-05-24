package exercise;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("돈의 액수를 입력하세요>>");
		int money = scanner.nextInt();
		
		int m50000 = money / 50000;
		money = money % 50000;
		int m10000 = money / 10000;
		money = money % 10000;
		int m1000 = money / 1000;
		money = money % 1000;
		int m500 = money / 500;
		money = money % 500;
		int m100 = money / 100;
		money = money % 100;
		int m10 = money / 10;
		money = money % 10;
		int m1 = money / 1;
		money = money % 1;
		
		System.out.println("오만원" + m50000 + "개, 만원" + m10000 +
				"개, 천원" + m1000 + "개, 500원" + m500 + "개, 100원" + m100 +
				"개, 10원" + m10 + "개, 1원" + m1 + "개");
		
		scanner.close();
	}
		
}