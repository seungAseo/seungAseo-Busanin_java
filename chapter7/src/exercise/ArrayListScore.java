package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListScore {

	public static void main(String[] args) {
		ArrayList<Character> gradeList = new ArrayList<Character>();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("빈 칸으로 분리하여 5 개의 학점을 입력(A/B/C/D/F)>>");
		for(int i = 0; i < 5; i++) {
			char inputNum = scanner.next().charAt(0);
			gradeList.add(inputNum);
		}
		scanner.close();
		
		for(int i = 0; i < gradeList.size(); i++) {
			switch(gradeList.get(i)) {
				case 'A' :
					System.out.print("4.0" + " ");
					break;
				case 'B' :
					System.out.print("3.0" + " ");
					break;
				case 'C' :
					System.out.print("2.0" + " ");
					break;
				case 'D' :
					System.out.print("1.0" + " ");
					break;
				case 'F' :
					System.out.print("0.0" + " ");
					break;
			}
		}		
	}

}
