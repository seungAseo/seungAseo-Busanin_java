package example;

import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		HashMap<String, String> nations = new HashMap<String, String>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나라이름과 수도를 입력하세요.(예 : Korea 서울)");
		while(true) {
			System.out.print("나라이름, 수도>> ");
			String nation = scanner.next();
			if(nation.equals("그만")) {
				break;
			}
			String capital = scanner.next();
			nations.put(nation, capital);
		}
		
		while(true) {
			System.out.print("수도 검색 >> ");
			String nation = scanner.next();
			if(nation.equals("그만")) {
				System.out.println("End");
				break;
			}
			String capital = nations.get(nation);
			if(capital != null) {
				System.out.println(nation + "의 수도는 " + capital);
			} else {
				System.out.println(nation + " 나라는 없습니다.");
			}
		}
		scanner.close();
	}

}
