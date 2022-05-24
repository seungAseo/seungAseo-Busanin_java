package exercise;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] intArray = new int[10];
		
		System.out.print("정수 10개 입력>>");
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();	// 정수를 배열에 각각 저장
		}
		
		for(int i = 0; i < intArray.length; i++) {
			if(intArray[i] % 3 == 0) {
				System.out.print(intArray[i] + " ");
			}
		}
		scanner.close();
	}

}
