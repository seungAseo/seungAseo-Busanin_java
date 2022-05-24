package exercise;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("커피 주문하세요>>");
		String coffee = scanner.next();
		int count = scanner.nextInt();
		
		if(coffee.equals("에스프레소")) {
			if(count >= 10) {
				System.out.println(2000 * count * 0.95 + "원입니다.");
			} else {
				System.out.println(2000 * count + "원입니다.");				
			}
		} else if(coffee.equals("아메리카노")) {
			System.out.println(2500 * count + "원입니다.");
		} else if(coffee.equals("카푸치노")) {
			System.out.println(3000 * count + "원입니다.");
		} else if(coffee.equals("카페라떼")) {
			System.out.println(3500 * count + "원입니다.");
		} else {
			System.out.println("없는 메뉴입니다.");
		}
		
		scanner.close();
	}

}
