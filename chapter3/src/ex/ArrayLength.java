package ex;

import java.util.Scanner;

public class ArrayLength {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("5개의 정수를 입력하세요.");
		int intArray[] = new int[5];	// 배열 선언과 생성
		double sum = 0.0;
		
		for(int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();	// 키보드에서 입력받은 정수 저장
		}
		for(int i = 0; i < intArray.length; i++) {
			sum += intArray[i];		// 배열에 저장된 정수 값을 더하기
		}
		System.out.println("평균은 " + sum / intArray.length);
		
		scanner.close();
	}

}
