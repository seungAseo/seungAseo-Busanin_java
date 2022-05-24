package exercise;

import java.util.Scanner;
import java.util.Vector;

public class MaxVector {

	public static void main(String[] args) {
		Vector<Double> vd = new Vector<Double>();
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			double inputNum = scanner.nextDouble();
			vd.add(inputNum);
		}
		
		double maxNum = 0.0;
		for(int i = 0; i < vd.size(); i++) {
			if(maxNum < vd.get(i)) {
				maxNum = vd.get(i);
			}
		}
		System.out.println("가장 큰 수는 " + maxNum);
		scanner.close();
	}

}
