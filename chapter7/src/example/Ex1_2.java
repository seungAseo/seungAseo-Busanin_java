package example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex1_2 {

	public static void main(String[] args) {
		HashMap<Character, Double> map = new HashMap<Character, Double>();
		map.put('A', 4.0);
		map.put('B', 3.0);
		map.put('C', 2.0);
		map.put('D', 1.0);
		map.put('F', 0.0);
		
		Set<Character> keys = map.keySet();
		Iterator<Character> it = keys.iterator();
		while(it.hasNext()) {
			Character key = it.next();
			Double value = map.get(key);
			System.out.println(value);
		}
	}

}
