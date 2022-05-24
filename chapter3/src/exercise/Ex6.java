package exercise;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		String[] eng = {"student", "love", "java", "happy", "future"};
		String[] kor = {"학생", "사랑", "자바", "행복한", "미래"};
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("영어 단어를 입력하세요>>");
			String str = scanner.nextLine();
			if(str.equals("exit")) {
				System.out.println("종료합니다...");
				break;
			}
			
			int i;
			for(i = 0; i < eng.length; i++) {
				if(eng[i].equals(str)) {
					System.out.println(kor[i]);
					break;
				}
			}
//			System.out.println("i의 값 : " + i);
//			System.out.println("eng 배열의 length: " + eng.length);
			if(i == eng.length) {	// 입력된 단어가 배열 eng[]에 없음
				System.out.println("그런 영어 단어가 없습니다.");
			}
		}
		scanner.close();
	}

}
