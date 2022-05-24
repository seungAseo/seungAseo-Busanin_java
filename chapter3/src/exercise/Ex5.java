package exercise;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] intArray = new int[10];
		
		System.out.print("정수 10개 입력>>");
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		// 버블 소트(bubble sort)
		for(int i = 0; i < intArray.length; i++) {
			for(int j = i; j < intArray.length; j++) {
				if(intArray[i] > intArray[j]) {
					int temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		// 	17 3 9 -6 77 234 5 23 -3 1
		// 1. 3 17 9 -6 77 234 5 23 -3 1 | i = 0 / j = 1
		// 2. 3 17 9 -6 77 234 5 23 -3 1 | i = 0 / j = 2
		// 3. -6 17 9 3 77 234 5 23 -3 1 | i = 0 / j = 3
		// ....
		//    -6 17 9 3 77 234 5 23 -3 1
		// ....
		//    -6 -3 1 3 5 9 17 23 77 234 
		
		for(int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
		scanner.close();
	}
	

}
