package repeat;

import java.util.Scanner;

public class Rex8 {
 // 첫번째 입력값은 메뉴고 두 번째 입력값은 숫자
	public static void main(String[] args) {
		
		System.out.println("커피를 주문하세요. >>");
		Scanner scanner = new Scanner(System.in);
		String menu = scanner.nextLine(); // 문자열을 입력 받는 nextLine()
		int amount = scanner.nextInt();	  // 숫자를 입력 받는 nextInt()
		int price = 0;
		
		if(menu.equals("에스프레소")) {
			price = 2000 * amount;
		} else if(menu.equals("아메리카노")) {
			price = 2500 * amount;
		} else if(menu.equals("카푸치노")) {
			price = 3000 * amount;
		} else if(menu.equals("카페라떼")) {
			price = 3500 * amount;
		}
		System.out.println(price + "원입니다.");
		scanner.close();
	}

}
