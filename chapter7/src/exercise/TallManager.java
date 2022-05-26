package exercise;

import java.util.Scanner;
import java.util.Vector;

public class TallManager {

	public static void main(String[] args) {
		Vector<Double> vHeight = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("2000~2009년까지 1년 단위로 키(cm)를 입력");
		System.out.print(">>");
		for(int i = 0; i < 10; i++) {
			vHeight.add(scanner.nextDouble());
		}
		
		double maxDiff = 0.0;
		int year = 0;
		for(int i = 0; i < vHeight.size() -1; i++) {
			double diff = vHeight.get(i + 1) - vHeight.get(i);
			if(maxDiff < diff) {
				maxDiff = diff;
				year = i + 1;
			}
		}
		System.out.println("가장 키가 많이 자란 년도는 " + (2000 + year) + "년 " + maxDiff);
		scanner.close();
	}
}
