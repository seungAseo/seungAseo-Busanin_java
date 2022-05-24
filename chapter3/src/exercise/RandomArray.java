package exercise;

public class RandomArray {

	public static void main(String[] args) {
		int intArray[][];	// 2차원 정수 배열 선언
		intArray = new int[3][4]; // intArray에 3x4 정수 배열 생성
		
		// 12개의 정수를 랜덤하게 발생시켜 배열에 순서대로 저장한다.
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				intArray[i][j] = (int)(Math.random()*10); // 0~9의 랜덤정수
			}
		}
		
		// 3x4 배열을 출력한다.
		for(int i = 0; i < intArray.length; i++) {		  // length 필드를 이용하라
			for(int j = 0; j < intArray[i].length; j++) { // length 필드를 이용하라
				System.out.print(intArray[i][j] + "\t");  // 원소 [i][j] 출력
			}
			System.out.println();	// 다음 줄로 넘어감
		}
		
		// 3x4 배열의 합을 구하여 출력한다.
		int i = 0, sum = 0;
		while(i < 3) { // 3개의 각 행에 대해 반복
			for(int j = 0; j < 4; j++) {
				sum += intArray[i][j];
			}
			i++;
		}
		System.out.println("합은 " + sum);
	}
}
