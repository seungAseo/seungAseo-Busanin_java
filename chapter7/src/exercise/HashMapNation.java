package exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapNation {

	public static void main(String[] args) {
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		
		// HashMap에 입력
		System.out.println("나라 이름과 인구를 5개 입력하세요.(예: Korea 5000)");
		for(int i = 0; i < 5; i++) {
			System.out.print("나라 이름, 인구 >> ");
			String nation = scanner.next();
			int population = scanner.nextInt();
			nations.put(nation, population);
		}
		
		// 제일 인구가 많은 나라 검색
		int maxPopulation = 0;
		String maxNation = "";
		Set<String> keys = nations.keySet();
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String key = it.next();
			int value = nations.get(key);
			if(maxPopulation < value) {
				maxPopulation = value;
				maxNation = key;
			}
		}
		System.out.println("제일 인구가 많은 나라는 (" + maxNation +", "+ maxPopulation + ")");
	}

}
