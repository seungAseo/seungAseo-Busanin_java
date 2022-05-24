package example;

import java.util.Scanner;
import java.util.Vector;

public class Ex3 {

	static void print(Vector<Integer> v) {
		int sum = 0;
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + " ");
			sum += v.get(i);
		}
		System.out.println();
		System.out.println("현재 평균 : " + sum/v.size());
	}
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)>>");
			int rainFall = scanner.nextInt();
			if(rainFall == 0) {
				System.out.println("End");
				break;
			}
			v.add(rainFall);
			
			print(v);
		}
		scanner.close();
	}

}
