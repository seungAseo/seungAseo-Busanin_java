package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class CustomerManager {

	// 현재까지의 모든 고객의 포인트 점수를 출력하는 메소드
	static void printMap(HashMap<String, Integer> map) {
		Set<String> keys = map.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = map.get(key);
			
			System.out.print("(" + key + "," + value + ")");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		HashMap<String, Integer> customerMap = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("** 포인트 관리 프로그램입니다. **");
		while(true) {
			System.out.print("이름과 포인트 입력>>");
			String name = scanner.next();
			if(name.equals("exit")) {
				System.out.println("프로그램을 종료합니다...");
				break;
			}
			// 고객의 총 포인트
			int point = scanner.nextInt();
			
			// 고객의 현재 포인트
			Integer currentPoint = customerMap.get(name);
			if(currentPoint != null) {
				point += currentPoint;
			}
			customerMap.put(name, point);
			
			printMap(customerMap);
		}
		scanner.close();
	}

}
