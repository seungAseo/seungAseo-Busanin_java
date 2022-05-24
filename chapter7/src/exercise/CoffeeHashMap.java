package exercise;

import java.util.HashMap;
import java.util.Scanner;

public class CoffeeHashMap {

	public static void main(String[] args) {
		HashMap<String, Integer> coffeeMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		coffeeMap.put("에스프레소", 2000);
		coffeeMap.put("아메리카노", 2500);
		coffeeMap.put("카푸치노", 3000);
		coffeeMap.put("카페라떼", 3500);
		
		System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
		while(true) {
			System.out.print("주문 >> ");
			String coffee = scanner.next();
			if(coffee.equals("그만")) {
				break;
			}
			int price = coffeeMap.get(coffee);
			System.out.println(coffee + "는 " + price + "입니다.");
		}
		scanner.close();
	}

}
