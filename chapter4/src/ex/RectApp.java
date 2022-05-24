package ex;

import java.util.Scanner;

class Rectangle {
	int width;
	int height;
	public int getArea() {
		return width * height;
	}
}

public class RectApp {
	// 절차지향형 프로그래밍(PP - Procedural Programming)
	// 객체지향형 프로그래밍(OOP - Object Oriented Programming)
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();		// 객체 생성
		
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("사각형의 면적은 " + rect.getArea());
		scanner.close();
	}
}
